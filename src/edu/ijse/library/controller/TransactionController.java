/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.library.controller;

import edu.ijse.library.dto.FineDto;
import edu.ijse.library.dto.TransactionDto;
import edu.ijse.library.service.ServiceFactory;
import edu.ijse.library.service.custom.TransactionService;
import java.util.ArrayList;

/**
 *
 * @author AVISHKA GIHAN
 */
public class TransactionController {
    
    private TransactionService transactionService = (TransactionService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.TRANSACTION);
    
    public String save(TransactionDto transactionDto) throws Exception {
        return transactionService.save(transactionDto);
    }
    
    public TransactionDto get(String code) throws Exception {
        return transactionService.get(code);
    }
    
    public ArrayList<TransactionDto> getAll() throws Exception {
        return transactionService.getAll();
    }
    
    public String completeTransaction(TransactionDto transactionDto) throws Exception {
        return transactionService.completeTransaction(transactionDto);
    }
    
    public String save(FineDto fineDto) throws Exception {
        return transactionService.save(fineDto);
    }
    
    public FineDto getFine(String code) throws Exception {
        return transactionService.getFine(code);
    }
    
    public String update(FineDto fineDto) throws Exception {
        return transactionService.update(fineDto);
    }
    
    
}
