/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edu.ijse.library;

import edu.ijse.library.view.BookBorrowView;
import edu.ijse.library.view.BookReturnView;
import edu.ijse.library.view.BookView;
import edu.ijse.library.view.CategoryView;
import edu.ijse.library.view.FineView;
import edu.ijse.library.view.HomeView;
import edu.ijse.library.view.LoginView;
import edu.ijse.library.view.MemberView;
import edu.ijse.library.view.RegisterView;

/**
 *
 * @author AVISHKA GIHAN
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new LoginView().setVisible(true);

    }

}
