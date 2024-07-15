/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.library.dao.custom.impl;

import edu.ijse.library.dao.CrudUtil;
import edu.ijse.library.dao.custom.TransactionDao;
import edu.ijse.library.dto.FineDto;
import edu.ijse.library.dto.TransactionDto;
import edu.ijse.library.entity.FineEntity;
import edu.ijse.library.entity.TransactionEntity;
import java.sql.ResultSet;
import java.util.ArrayList;

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
    public ArrayList<TransactionEntity> getAll() throws Exception {
        ResultSet resultSet = CrudUtil.executeQuery("SELECT * FROM transaction");
        ArrayList<TransactionEntity> transactionList = new ArrayList<>();
        while (resultSet.next()) {
            transactionList.add(new TransactionEntity(
                    resultSet.getString("code"),
                    resultSet.getString("bookID"),
                    resultSet.getString("memberID"),
                    resultSet.getString("borrowDate"),
                    resultSet.getString("dueDate"),
                    resultSet.getString("returnDate"),
                    resultSet.getDouble("fine")
            ));
        }
        return transactionList;
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

    @Override
    public String save(FineEntity fineEntity) throws Exception {
        boolean isSaved = CrudUtil.executeUpdate(
                "INSERT INTO fine (transactionID, amount, paid) "
                + "SELECT t.transactionID, ?, ? "
                + "FROM transaction t "
                + "WHERE t.code = ?",
                fineEntity.getAmount(),
                fineEntity.isPaid(),
                fineEntity.getTransactionCode()
        );
        return isSaved ? "Success" : "Fail";
    }

    @Override
    public FineDto getFine(String code) throws Exception {
        ResultSet rst = CrudUtil.executeQuery(
                "SELECT f.fineID, f.transactionID, f.amount, f.paid "
                + "FROM fine f "
                + "INNER JOIN transaction t ON f.transactionID = t.transactionID "
                + "WHERE t.code = ?",
                code
        );
        if (rst.next()) {
            FineDto fineDto = new FineDto(
                    rst.getInt("fineID"),
                    rst.getString("transactionID"),
                    rst.getDouble("amount"),
                    rst.getBoolean("paid")
            );
            return fineDto;
        }
        return null;
    }

    @Override
    public String update(FineEntity fineEntity) throws Exception {
        boolean isUpdated = CrudUtil.executeUpdate(
                "UPDATE fine f "
                + "INNER JOIN transaction t ON f.transactionID = t.transactionID "
                + "SET f.paid = ? "
                + "WHERE t.code = ?",
                fineEntity.isPaid(),
                fineEntity.getTransactionCode()
        );
        return isUpdated ? "Success" : "Fail";
    }

    @Override
    public String update(TransactionEntity transactionEntity) throws Exception {
        boolean isUpdated = CrudUtil.executeUpdate(
                "UPDATE transaction SET fine = 0 WHERE code = ?",
                transactionEntity.getTransactionCode()
        );
        return isUpdated ? "Success" : "Fail";
    }

}
