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
    private String code;
    private int bookID;
    private int memberID;
    private String borrowDate;
    private String dueDate;
    private String returnDate;
    private double fine;

    public TransactionDto() {
    }

    public TransactionDto(int transactionID, String code, int bookID, int memberID, String borrowDate, String dueDate, String returnDate, double fine) {
        this.transactionID = transactionID;
        this.code = code;
        this.bookID = bookID;
        this.memberID = memberID;
        this.borrowDate = borrowDate;
        this.dueDate = dueDate;
        this.returnDate = returnDate;
        this.fine = fine;
    }

    public TransactionDto(String code, int bookID, int memberID, String borrowDate, String dueDate, String returnDate, double fine) {
        this.code = code;
        this.bookID = bookID;
        this.memberID = memberID;
        this.borrowDate = borrowDate;
        this.dueDate = dueDate;
        this.returnDate = returnDate;
        this.fine = fine;
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
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the bookID
     */
    public int getBookID() {
        return bookID;
    }

    /**
     * @param bookID the bookID to set
     */
    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    /**
     * @return the memberID
     */
    public int getMemberID() {
        return memberID;
    }

    /**
     * @param memberID the memberID to set
     */
    public void setMemberID(int memberID) {
        this.memberID = memberID;
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
        return "TransactionDto{" + "transactionID=" + transactionID + ", code=" + code + ", bookID=" + bookID + ", memberID=" + memberID + ", borrowDate=" + borrowDate + ", dueDate=" + dueDate + ", returnDate=" + returnDate + ", fine=" + fine + '}';
    }
    
    
    
}
