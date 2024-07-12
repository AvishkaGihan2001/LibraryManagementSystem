/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.library.service.custom;

import edu.ijse.library.dto.TransactionDto;
import edu.ijse.library.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author AVISHKA GIHAN
 */
public interface TransactionService extends SuperService{
    
    public String save(TransactionDto transactionDto) throws Exception;
    
    public TransactionDto get(String code) throws Exception;
    
    public String completeTransaction(TransactionDto transactionDto) throws Exception;
    
    public ArrayList<TransactionDto> getAll() throws Exception;
    
}
