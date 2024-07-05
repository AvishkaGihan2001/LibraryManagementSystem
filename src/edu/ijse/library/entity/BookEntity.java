/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.library.entity;

/**
 *
 * @author AVISHKA GIHAN
 */
public class BookEntity {

    private int bookID;
    private String code;
    private String title;
    private String author;
    private String publisher;
    private String publishedDate;
    private String description;
    private int quantity;
    private int categoryID;

    public BookEntity() {
    }

    public BookEntity(int bookID, String code, String title, String author, String publisher, String publishedDate, String description, int quantity, int categoryID) {
        this.bookID = bookID;
        this.code = code;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.publishedDate = publishedDate;
        this.description = description;
        this.quantity = quantity;
        this.categoryID = categoryID;
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
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * @return the publisher
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * @param publisher the publisher to set
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     * @return the publishedDate
     */
    public String getPublishedDate() {
        return publishedDate;
    }

    /**
     * @param publishedDate the publishedDate to set
     */
    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the categoryID
     */
    public int getCategoryID() {
        return categoryID;
    }

    /**
     * @param categoryID the categoryID to set
     */
    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    @Override
    public String toString() {
        return "BookEntity{" + "bookID=" + bookID + ", code=" + code + ", title=" + title + ", author=" + author + ", publisher=" + publisher + ", publishedDate=" + publishedDate + ", description=" + description + ", quantity=" + quantity + ", categoryID=" + categoryID + '}';
    }

}
