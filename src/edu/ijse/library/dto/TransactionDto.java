/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.library.dto;

/**
 *
 * @author AVISHKA GIHAN
 */
public class TransactionDto {

    private int transactionID;
    private String transactionCode;
    private String bookCode;
    private String memberCode;
    private String borrowDate;
    private String dueDate;
    private String returnDate;
    private double fine;

    public TransactionDto() {
    }

    public TransactionDto(int transactionID, String transactionCode, String bookCode, String memberCode, String borrowDate, String dueDate, String returnDate, double fine) {
        this.transactionID = transactionID;
        this.transactionCode = transactionCode;
        this.bookCode = bookCode;
        this.memberCode = memberCode;
        this.borrowDate = borrowDate;
        this.dueDate = dueDate;
        this.returnDate = returnDate;
        this.fine = fine;
    }

    public TransactionDto(String transactionCode, String bookCode, String memberCode, String borrowDate, String dueDate, String returnDate, double fine) {
        this.transactionCode = transactionCode;
        this.bookCode = bookCode;
        this.memberCode = memberCode;
        this.borrowDate = borrowDate;
        this.dueDate = dueDate;
        this.returnDate = returnDate;
        this.fine = fine;
    }

    public TransactionDto(String transactionCode, String bookCode, String memberCode, String borrowDate, String dueDate) {
        this.transactionCode = transactionCode;
        this.bookCode = bookCode;
        this.memberCode = memberCode;
        this.borrowDate = borrowDate;
        this.dueDate = dueDate;
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
     * @return the bookCode
     */
    public String getBookCode() {
        return bookCode;
    }

    /**
     * @param bookCode the bookCode to set
     */
    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    /**
     * @return the memberCode
     */
    public String getMemberCode() {
        return memberCode;
    }

    /**
     * @param memberCode the memberCode to set
     */
    public void setMemberCode(String memberCode) {
        this.memberCode = memberCode;
    }

    /**
     * @return the borrowDate
     */
    public String getBorrowDate() {
        return borrowDate;
    }

    /**
     * @param borrowDate the borrowDate to set
     */
    public void setBorrowDate(String borrowDate) {
        this.borrowDate = borrowDate;
    }

    /**
     * @return the dueDate
     */
    public String getDueDate() {
        return dueDate;
    }

    /**
     * @param dueDate the dueDate to set
     */
    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    /**
     * @return the returnDate
     */
    public String getReturnDate() {
        return returnDate;
    }

    /**
     * @param returnDate the returnDate to set
     */
    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    /**
     * @return the fine
     */
    public double getFine() {
        return fine;
    }

    /**
     * @param fine the fine to set
     */
    public void setFine(double fine) {
        this.fine = fine;
    }

    @Override
    public String toString() {
        return "TransactionDto{" + "transactionID=" + transactionID + ", transactionCode=" + transactionCode + ", bookCode=" + bookCode + ", memberCode=" + memberCode + ", borrowDate=" + borrowDate + ", dueDate=" + dueDate + ", returnDate=" + returnDate + ", fine=" + fine + '}';
    }

}
