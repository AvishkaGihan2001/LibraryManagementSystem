/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.library.dao.custom;

import edu.ijse.library.dao.SuperDAO;
import edu.ijse.library.dto.FineDto;
import edu.ijse.library.dto.TransactionDto;
import edu.ijse.library.entity.FineEntity;
import edu.ijse.library.entity.TransactionEntity;
import java.util.ArrayList;

/**
 *
 * @author AVISHKA GIHAN
 */
public interface TransactionDao extends SuperDAO {

    String save(TransactionEntity transactionEntity) throws Exception;

    TransactionDto get(String code) throws Exception;
    
    String completeTransaction(TransactionEntity transactionEntity) throws Exception;
    
    ArrayList<TransactionEntity> getAll() throws Exception;
    
    String save(FineEntity fineEntity) throws Exception;
    
    FineDto getFine(String code) throws Exception;
    
    String update(FineEntity fineEntity) throws Exception;
    
    String update(TransactionEntity transactionEntity) throws Exception;

}
