/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.library.service.custom.impl;

import edu.ijse.library.dao.DaoFactory;
import edu.ijse.library.dao.custom.TransactionDao;
import edu.ijse.library.dto.TransactionDto;
import edu.ijse.library.entity.TransactionEntity;
import static edu.ijse.library.service.ServiceFactory.ServiceType.TRANSACTION;
import edu.ijse.library.service.custom.TransactionService;

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
    public String completeTransaction(TransactionDto transactionDto) throws Exception {
        TransactionEntity transactionEntity = new TransactionEntity(
                transactionDto.getTransactionCode(),
                transactionDto.getReturnDate(),
                transactionDto.getFine()
        );
        
        return transactionDao.completeTransaction(transactionEntity);
    }

}
