/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.library.controller;

import edu.ijse.library.dto.UserDto;
import edu.ijse.library.service.ServiceFactory;
import edu.ijse.library.service.custom.UserService;


/**
 *
 * @author AVISHKA GIHAN
 */
public class UserController {
    
     private UserService userService = (UserService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.USER);
    
    public String login(UserDto userDto) throws Exception{
        return userService.login(userDto);
    }
    
    public String register(UserDto userDto) throws  Exception{
        return userService.register(userDto);
    }
}
