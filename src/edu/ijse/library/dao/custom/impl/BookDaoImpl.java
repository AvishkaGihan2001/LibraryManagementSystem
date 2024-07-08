/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.library.dao.custom.impl;

import edu.ijse.library.dao.CrudUtil;
import edu.ijse.library.dao.custom.BookDao;
import edu.ijse.library.dto.BookDto;
import edu.ijse.library.entity.BookEntity;
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author AVISHKA GIHAN
 */
public class BookDaoImpl implements BookDao {

    @Override
    public String save(BookEntity bookEntity) throws Exception {
        boolean isSaved = CrudUtil.executeUpdate("INSERT INTO book VALUES(?,?,?,?,?,?,?,?,?)",
                0,
                bookEntity.getCode(),
                bookEntity.getTitle(),
                bookEntity.getAuthor(),
                bookEntity.getPublisher(),
                bookEntity.getPublishedDate(),
                bookEntity.getDescription(),
                bookEntity.getQuantity(),
                bookEntity.getCategoryID()
        );
        return isSaved ? "Success" : "Fail";
    }

    @Override
    public String update(BookEntity bookEntity) throws Exception {
        boolean isUpdated = CrudUtil.executeUpdate("UPDATE book SET title = ?, author = ?, publisher = ?, publishedDate = ?, description = ?, quantity = ?, categoryID = ? WHERE code = ?",
                bookEntity.getTitle(),
                bookEntity.getAuthor(),
                bookEntity.getPublisher(),
                bookEntity.getPublishedDate(),
                bookEntity.getDescription(),
                bookEntity.getQuantity(),
                bookEntity.getCategoryID(),
                bookEntity.getCode()
        );
        return isUpdated ? "Success" : "Fail";
    }

    @Override
    public String delete(String code) throws Exception {
        boolean isDeleted = CrudUtil.executeUpdate("DELETE FROM book WHERE code = ?", code);
        return isDeleted ?  "Success" : "Fail";
    }

    @Override
    public BookDto get(String code) throws Exception {
         ResultSet rst = CrudUtil.executeQuery("SELECT * FROM book WHERE code = ?", code);
          if(rst.next()){
           BookDto bookDto = new BookDto(
                   rst.getString("code"),
                   rst.getString("title"),
                   rst.getString("author"),
                   rst.getString("publisher"),
                   rst.getString("publishedDate"),
                   rst.getString("description"),
                   rst.getInt("quantity"),
                   rst.getInt("categoryID")
           );
           return bookDto;
          }
          return null;
    }

    @Override
    public ArrayList<BookEntity> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
