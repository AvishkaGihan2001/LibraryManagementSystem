/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.library.service.custom.impl;

import edu.ijse.library.dao.DaoFactory;
import edu.ijse.library.dao.custom.CategoryDao;
import edu.ijse.library.dto.CategoryDto;
import edu.ijse.library.entity.CategoryEntity;
import edu.ijse.library.service.custom.CategoryService;
import java.util.ArrayList;

/**
 *
 * @author AVISHKA GIHAN
 */
public class CategoryServiceImpl implements CategoryService{
    
    private CategoryDao categoryDao = (CategoryDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.CATEGORY);

    @Override
    public String save(CategoryDto categoryDto) throws Exception {
        CategoryEntity categoryEntity = new CategoryEntity(
                categoryDto.getCode(),
                categoryDto.getCategoryName(),
                categoryDto.getDescription()
        );
        return categoryDao.save(categoryEntity);
    }

    @Override
    public String update(CategoryDto categoryDto) throws Exception {
        CategoryEntity categoryEntity = new CategoryEntity(
                categoryDto.getCode(),
                categoryDto.getCategoryName(),
                categoryDto.getDescription()
        );
        return categoryDao.update(categoryEntity);
    }

    @Override
    public String delete(String code) throws Exception {
        return categoryDao.delete(code);
    }

    @Override
    public CategoryDto get(String code) throws Exception {
        return categoryDao.get(code);
    }

    @Override
    public ArrayList<CategoryDto> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
