/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.library.dao.custom;

import edu.ijse.library.dao.SuperDAO;
import edu.ijse.library.dto.BookDto;
import edu.ijse.library.entity.BookEntity;
import java.util.ArrayList;

/**
 *
 * @author AVISHKA GIHAN
 */
public interface BookDao extends SuperDAO {

    String save(BookEntity bookEntity) throws Exception;

    String update(BookEntity bookEntity) throws Exception;

    String delete(String code) throws Exception;

    BookDto get(String code) throws Exception;

    ArrayList<BookEntity> getAll() throws Exception;

}
