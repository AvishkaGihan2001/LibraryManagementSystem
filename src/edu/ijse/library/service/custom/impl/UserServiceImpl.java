/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.library.service.custom.impl;

import edu.ijse.library.dao.DaoFactory;
import edu.ijse.library.dao.custom.UserDao;
import edu.ijse.library.dto.UserDto;
import edu.ijse.library.entity.UserEntity;
import edu.ijse.library.service.custom.UserService;

/**
 *
 * @author AVISHKA GIHAN
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao = (UserDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.USER);

    @Override
    public String login(UserDto userDto) throws Exception {
        UserEntity userEntity = new UserEntity(
                userDto.getUserName(),
                userDto.getPassword()
        );

        return userDao.login(userEntity);
    }

    @Override
    public String register(UserDto userDto) throws Exception {
        UserEntity userEntity = new UserEntity(
                userDto.getCode(),
                userDto.getFirstName(),
                userDto.getLastName(),
                userDto.getUserName(),
                userDto.getPassword()
        );
        
        return userDao.register(userEntity);
    }

}
