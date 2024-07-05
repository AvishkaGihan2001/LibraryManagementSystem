/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.library.dao;

import edu.ijse.library.dao.custom.impl.BookDaoImpl;
import edu.ijse.library.dao.custom.impl.CategoryDaoImpl;
import edu.ijse.library.dao.custom.impl.MemberDaoImpl;
import edu.ijse.library.dao.custom.impl.UserDaoImpl;

/**
 *
 * @author AVISHKA GIHAN
 */
public class DaoFactory {

    private static DaoFactory daoFactory;

    private DaoFactory() {
    }

    public static DaoFactory getInstance() {
        if (daoFactory == null) {
            daoFactory = new DaoFactory();
        }
        return daoFactory;
    }

    public SuperDAO getDao(DaoTypes type) {
        switch (type) {
            case CATEGORY:
                return new CategoryDaoImpl();
            case BOOK:
                return new BookDaoImpl();
            case MEMBER:
                return new MemberDaoImpl();
            case USER:
                return new UserDaoImpl();

            default:
                return null;

        }
    }

    public enum DaoTypes {
        CATEGORY, BOOK, MEMBER , USER
    }

}
