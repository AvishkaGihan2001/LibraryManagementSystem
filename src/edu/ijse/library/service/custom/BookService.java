/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.library.service.custom;

import edu.ijse.library.dto.BookDto;
import edu.ijse.library.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author AVISHKA GIHAN
 */
public interface BookService extends SuperService{

    public String save(BookDto bookDto) throws Exception;

    public String update(BookDto bookDto) throws Exception;
    
    public String updateQuantity(BookDto bookDto) throws  Exception;

    public String delete(String code) throws Exception;

    public BookDto get(String code) throws Exception;

    public ArrayList<BookDto> getAll() throws Exception;

}
