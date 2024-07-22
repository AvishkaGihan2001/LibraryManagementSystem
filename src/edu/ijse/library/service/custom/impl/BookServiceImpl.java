/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.library.service.custom.impl;

import edu.ijse.library.dao.DaoFactory;
import edu.ijse.library.dao.custom.BookDao;
import edu.ijse.library.dto.BookDto;
import edu.ijse.library.entity.BookEntity;
import edu.ijse.library.service.custom.BookService;
import java.util.ArrayList;

/**
 *
 * @author AVISHKA GIHAN
 */
public class BookServiceImpl implements BookService {

    private BookDao bookDao = (BookDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.BOOK);

    @Override
    public String save(BookDto bookDto) throws Exception {
        BookEntity bookEntity = new BookEntity(
                bookDto.getCode(),
                bookDto.getTitle(),
                bookDto.getAuthor(),
                bookDto.getPublisher(),
                bookDto.getPublishedDate(),
                bookDto.getDescription(),
                bookDto.getQuantity(),
                bookDto.getCategoryID()
        );

        return bookDao.save(bookEntity);

    }

    @Override
    public String update(BookDto bookDto) throws Exception {
        BookEntity bookEntity = new BookEntity(
                bookDto.getCode(),
                bookDto.getTitle(),
                bookDto.getAuthor(),
                bookDto.getPublisher(),
                bookDto.getPublishedDate(),
                bookDto.getDescription(),
                bookDto.getQuantity(),
                bookDto.getCategoryID()
        );

        return bookDao.update(bookEntity);
    }
    
    @Override
    public String updateQuantity(BookDto bookDto) throws Exception {
        BookEntity bookEntity = new BookEntity(
                bookDto.getCode(),
                bookDto.getQuantity()
        );
        
        return bookDao.updateQuantity(bookEntity);
    }

    @Override
    public String delete(String code) throws Exception {
        return bookDao.delete(code);
    }

    @Override
    public BookDto get(String code) throws Exception {
        return bookDao.get(code);

    }

    @Override
    public ArrayList<BookDto> getAll() throws Exception {
        ArrayList<BookEntity> entityList = bookDao.getAll();

        // Convert each ItemEntity to ItemDto
        ArrayList<BookDto> dtoList = new ArrayList<>();
        for (BookEntity bookEntity : entityList) {
            BookDto bookDto = new BookDto(
                    bookEntity.getCode(),
                    bookEntity.getTitle(),
                    bookEntity.getAuthor(),
                    bookEntity.getPublisher(),
                    bookEntity.getPublishedDate(),
                    bookEntity.getDescription(),
                    bookEntity.getQuantity(),
                    bookEntity.getCategoryID()
            );
            dtoList.add(bookDto);
        }

        return dtoList;
    }

    

}
