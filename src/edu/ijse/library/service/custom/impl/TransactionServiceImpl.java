/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.library.service.custom.impl;

import edu.ijse.library.dao.DaoFactory;
import edu.ijse.library.dao.custom.TransactionDao;
import edu.ijse.library.db.DBConnection;
import edu.ijse.library.dto.FineDto;
import edu.ijse.library.dto.TransactionDto;
import edu.ijse.library.entity.FineEntity;
import edu.ijse.library.entity.TransactionEntity;
import edu.ijse.library.service.custom.TransactionService;
import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author AVISHKA GIHAN
 */
public class TransactionServiceImpl implements TransactionService {

    private TransactionDao transactionDao = (TransactionDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.TRANSACTION);

    @Override
    public String save(TransactionDto transactionDto) throws Exception {
        TransactionEntity transactionEntity = new TransactionEntity(
                transactionDto.getTransactionCode(),
                transactionDto.getBookCode(),
                transactionDto.getMemberCode(),
                transactionDto.getBorrowDate(),
                transactionDto.getDueDate()
        );

        return transactionDao.save(transactionEntity);

    }

    @Override
    public TransactionDto get(String code) throws Exception {
        return transactionDao.get(code);
    }

    @Override
    public ArrayList<TransactionDto> getAll() throws Exception {
        ArrayList<TransactionEntity> transactionEntitys = transactionDao.getAll();

        // Convert each ItemEntity to ItemDto
        ArrayList<TransactionDto> dtoList = new ArrayList<>();
        for (TransactionEntity transactionEntity : transactionEntitys) {
            TransactionDto transactionDto = new TransactionDto(
                    transactionEntity.getTransactionCode(),
                    transactionEntity.getBookCode(),
                    transactionEntity.getMemberCode(),
                    transactionEntity.getBorrowDate(),
                    transactionEntity.getDueDate(),
                    transactionEntity.getReturnDate(),
                    transactionEntity.getFine()
            );
            dtoList.add(transactionDto);
        }

        return dtoList;
    }

    @Override
    public String completeTransaction(TransactionDto transactionDto) throws Exception {
        TransactionEntity transactionEntity = new TransactionEntity(
                transactionDto.getTransactionCode(),
                transactionDto.getReturnDate(),
                transactionDto.getFine()
        );

        return transactionDao.completeTransaction(transactionEntity);
    }

    @Override
    public String save(FineDto fineDto) throws Exception {
        FineEntity fineEntity = new FineEntity(
                fineDto.getTransactionCode(),
                fineDto.getAmount(),
                fineDto.isPaid()
        );
        return transactionDao.save(fineEntity);
    }

    @Override
    public FineDto getFine(String code) throws Exception {
        return transactionDao.getFine(code);
    }

    @Override
    public String update(FineDto fineDto) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        try {
            connection.setAutoCommit(false);

            FineEntity fineEntity = new FineEntity(
                    fineDto.getTransactionCode(),
                    fineDto.isPaid()
            );
            String resp = transactionDao.update(fineEntity);
            if (resp.equals("Success")) {

                TransactionEntity transactionEntity = new TransactionEntity(
                        fineDto.getTransactionCode()
                );

                String trResp = transactionDao.update(transactionEntity);

                if (trResp.equals("Success")) {
                    connection.commit();
                    return "Success";

                } else {
                    connection.rollback();
                    return "Transaction update Error";
                }

            } else {
                connection.rollback();
                return "Fine update Error";
            }

        } catch (Exception e) {

            connection.rollback();
            e.printStackTrace();
            return "Server Error: " + e.getMessage();

        } finally {
            connection.setAutoCommit(true);
        }

    }

}
