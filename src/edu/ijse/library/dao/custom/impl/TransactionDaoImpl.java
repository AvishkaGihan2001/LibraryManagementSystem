/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.library.dao.custom.impl;

import edu.ijse.library.dao.CrudUtil;
import edu.ijse.library.dao.custom.TransactionDao;
import edu.ijse.library.dto.TransactionDto;
import edu.ijse.library.entity.TransactionEntity;
import java.sql.ResultSet;

/**
 *
 * @author AVISHKA GIHAN
 */
public class TransactionDaoImpl implements TransactionDao {

    @Override
    public String save(TransactionEntity transactionEntity) throws Exception {
        boolean isSaved = CrudUtil.executeUpdate(
                "INSERT INTO transaction (code, bookID, memberID, borrowDate, dueDate, returnDate, fine) "
                + "SELECT ?, b.bookID, m.memberID, ?, ?, NULL, NULL "
                + "FROM book b "
                + "INNER JOIN member m ON b.code = ? AND m.code = ?",
                transactionEntity.getTransactionCode(),
                transactionEntity.getBorrowDate(),
                transactionEntity.getDueDate(),
                transactionEntity.getBookCode(),
                transactionEntity.getMemberCode()
        );
        return isSaved ? "Success" : "Fail";
    }

    @Override
    public TransactionDto get(String code) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM transaction WHERE code = ?", code);
        if (rst.next()) {
            TransactionDto transactionDto = new TransactionDto(
                    rst.getString("code"),
                    rst.getString("bookID"),
                    rst.getString("memberID"),
                    rst.getString("borrowDate"),
                    rst.getString("dueDate"),
                    rst.getString("returnDate"),
                    rst.getDouble("fine")
            );
            return transactionDto;
        }
        return null;
    }

    @Override
    public String completeTransaction(TransactionEntity transactionEntity) throws Exception {
        boolean isSaved = CrudUtil.executeUpdate(
                "UPDATE transaction SET returnDate = ?, fine = ? WHERE code = ?",
                transactionEntity.getReturnDate(),
                transactionEntity.getFine(),
                transactionEntity.getTransactionCode()
        );
        return isSaved ? "Success" : "Fail";
    }

}
