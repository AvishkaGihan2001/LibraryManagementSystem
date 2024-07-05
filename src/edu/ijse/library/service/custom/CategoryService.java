/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.library.service.custom;

import edu.ijse.library.dto.CategoryDto;
import edu.ijse.library.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author AVISHKA GIHAN
 */
public interface CategoryService extends SuperService {

    public String save(CategoryDto categoryDto) throws Exception;

    public String update(CategoryDto categoryDto) throws Exception;

    public String delete(String ID) throws Exception;

    public CategoryDto get(String ID) throws Exception;

    public ArrayList<CategoryDto> getAll() throws Exception;

}
