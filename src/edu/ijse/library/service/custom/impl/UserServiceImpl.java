/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.library.service.custom.impl;

import edu.ijse.library.dao.DaoFactory;
import edu.ijse.library.dto.UserDto;
import edu.ijse.library.service.custom.UserService;

/**
 *
 * @author AVISHKA GIHAN
 */
public class UserServiceImpl implements UserService{
    
    private UserDto userDto = (UserDto) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.USER);

    @Override
    public String login(UserDto userDto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
