/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.library.entity;

/**
 *
 * @author AVISHKA GIHAN
 */
public class FineEntity {

    private int fineID;
    private int transactionID;
    private double amount;
    private boolean paid;

    public FineEntity() {
    }

    public FineEntity(int fineID, int transactionID, double amount, boolean paid) {
        this.fineID = fineID;
        this.transactionID = transactionID;
        this.amount = amount;
        this.paid = paid;
    }

    public FineEntity(int transactionID, double amount, boolean paid) {
        this.transactionID = transactionID;
        this.amount = amount;
        this.paid = paid;
    }

    /**
     * @return the fineID
     */
    public int getFineID() {
        return fineID;
    }

    /**
     * @param fineID the fineID to set
     */
    public void setFineID(int fineID) {
        this.fineID = fineID;
    }

    /**
     * @return the transactionID
     */
    public int getTransactionID() {
        return transactionID;
    }

    /**
     * @param transactionID the transactionID to set
     */
    public void setTransactionID(int transactionID) {
        this.transactionID = transactionID;
    }

    /**
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * @return the paid
     */
    public boolean isPaid() {
        return paid;
    }

    /**
     * @param paid the paid to set
     */
    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    @Override
    public String toString() {
        return "FineEntity{" + "fineID=" + fineID + ", transactionID=" + transactionID + ", amount=" + amount + ", paid=" + paid + '}';
    }
    
    

   
}
