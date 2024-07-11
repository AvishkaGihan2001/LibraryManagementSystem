/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.library.dao.custom;

import edu.ijse.library.dao.SuperDAO;
import edu.ijse.library.entity.TransactionEntity;

/**
 *
 * @author AVISHKA GIHAN
 */
public interface TransactionDao extends SuperDAO{
    
    String save(TransactionEntity transactionEntity) throws Exception;
    
}
