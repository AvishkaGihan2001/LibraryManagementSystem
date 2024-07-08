/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.library.dao.custom.impl;

import edu.ijse.library.dao.CrudUtil;
import edu.ijse.library.dao.custom.UserDao;
import edu.ijse.library.entity.UserEntity;
import java.sql.ResultSet;

/**
 *
 * @author AVISHKA GIHAN
 */
public class UserDaoImpl implements UserDao {

    @Override
    public String login(UserEntity userEntity) throws Exception {
        ResultSet resultSet = CrudUtil.executeQuery("Select password from user where userName = ? ",
                userEntity.getUserName()
        );

        if (resultSet.next()) {
            String password = resultSet.getString("password");
            if (password.equals(userEntity.getPassword())) {
                return "Login Successful";
            }
        }
        return "Login Failed";

    }

    @Override
    public String register(UserEntity userEntity) throws Exception {
        boolean isSaved = CrudUtil.executeUpdate("INSERT INTO user VALUES(?,?,?,?,?,?)",
                0,
                userEntity.getCode(),
                userEntity.getFirstName(),
                userEntity.getLastName(),
                userEntity.getUserName(),
                userEntity.getPassword()
        );
        return isSaved ? "Success" : "Fail";
    }

}
