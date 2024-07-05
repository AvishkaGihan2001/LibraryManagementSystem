/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.library.dao.custom;

import edu.ijse.library.dao.SuperDAO;
import edu.ijse.library.entity.CategoryEntity;
import java.util.ArrayList;

/**
 *
 * @author AVISHKA GIHAN
 */
public interface CategoryDao extends SuperDAO{

    String save(CategoryEntity categoryEntity) throws Exception;

    String update(CategoryEntity categoryEntity) throws Exception;

    String delete(String ID) throws Exception;

    CategoryEntity get(String ID) throws Exception;

    ArrayList<CategoryEntity> getAll() throws Exception;

}
