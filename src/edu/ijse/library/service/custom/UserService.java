/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.library.service.custom;

import edu.ijse.library.dto.UserDto;
import edu.ijse.library.service.SuperService;

/**
 *
 * @author AVISHKA GIHAN
 */
public interface UserService extends SuperService {

    public String login(UserDto userDto) throws Exception;

}
