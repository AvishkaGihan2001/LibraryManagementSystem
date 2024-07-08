/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.library.dao.custom.impl;

import edu.ijse.library.dao.CrudUtil;
import edu.ijse.library.dao.custom.CategoryDao;
import edu.ijse.library.dto.CategoryDto;
import edu.ijse.library.entity.CategoryEntity;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author AVISHKA GIHAN
 */
public class CategoryDaoImpl implements CategoryDao {

    @Override
    public String save(CategoryEntity categoryEntity) throws Exception {
        boolean isSaved = CrudUtil.executeUpdate("INSERT INTO category VALUES(?,?,?,?)",
                0,
                categoryEntity.getCode(),
                categoryEntity.getCategoryName(),
                categoryEntity.getDescription()
        );
        return isSaved ? "Success" : "Fail";
    }

    @Override
    public String update(CategoryEntity categoryEntity) throws Exception {
        boolean isUpdated = CrudUtil.executeUpdate("UPDATE category SET categoryName = ?, description = ? WHERE code = ?",
                categoryEntity.getCategoryName(),
                categoryEntity.getDescription(),
                categoryEntity.getCode()
        );
        return isUpdated ? "Success" : "Fail";
    }

    @Override
    public String delete(String code) throws Exception {
        boolean isDeleted = CrudUtil.executeUpdate("DELETE FROM category WHERE code = ?", code);
        return isDeleted ? "Success" : "Fail";
    }

    @Override
    public CategoryDto get(String code) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM category WHERE code = ?", code);
        if (rst.next()) {
            CategoryDto categoryDto = new CategoryDto(
                    rst.getString("code"),
                    rst.getString("categoryName"),
                    rst.getString("description")
            );
            return categoryDto;
        }
        return null;
    }

    @Override
    public ArrayList<CategoryEntity> getAll() throws Exception {
        return null;
    }

}
