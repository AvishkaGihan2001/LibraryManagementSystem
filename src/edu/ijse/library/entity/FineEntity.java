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
    private String transactionCode;
    private double amount;
    private boolean paid;

    public FineEntity() {
    }

    public FineEntity(int fineID, String transactionCode, double amount, boolean paid) {
        this.fineID = fineID;
        this.transactionCode = transactionCode;
        this.amount = amount;
        this.paid = paid;
    }

    public FineEntity(String transactionCode, double amount, boolean paid) {
        this.transactionCode = transactionCode;
        this.amount = amount;
        this.paid = paid;
    }

    public FineEntity(String transactionCode, boolean paid) {
        this.transactionCode = transactionCode;
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
     * @return the transactionCode
     */
    public String getTransactionCode() {
        return transactionCode;
    }

    /**
     * @param transactionCode the transactionCode to set
     */
    public void setTransactionCode(String transactionCode) {
        this.transactionCode = transactionCode;
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
        return "FineEntity{" + "fineID=" + fineID + ", transactionCode=" + transactionCode + ", amount=" + amount + ", paid=" + paid + '}';
    }

}
