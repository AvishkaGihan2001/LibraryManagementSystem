/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.library.controller;

import edu.ijse.library.dto.BookDto;
import edu.ijse.library.service.ServiceFactory;
import edu.ijse.library.service.custom.BookService;
import java.util.ArrayList;

/**
 *
 * @author AVISHKA GIHAN
 */
public class BookController {

    private BookService bookService = (BookService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.BOOK);

    public String save(BookDto bookDto) throws Exception {
        return bookService.save(bookDto);
    }

    public String update(BookDto bookDto) throws Exception {
        return bookService.update(bookDto);
    }
    
    public String updateQuantity(BookDto bookDto) throws Exception {
        return bookService.updateQuantity(bookDto);
    }
    
    public String delete(String code) throws Exception {
        return bookService.delete(code);
    }

    public BookDto get(String code) throws Exception {
        return bookService.get(code);
    }

    public ArrayList<BookDto> getAll() throws Exception {
        return bookService.getAll();
    }

}
