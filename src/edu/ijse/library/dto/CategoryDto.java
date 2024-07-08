/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.library.dto;

/**
 *
 * @author AVISHKA GIHAN
 */
public class CategoryDto {

    private int categoryID;
    private String code;
    private String categoryName;
    private String description;

    public CategoryDto() {
    }

    public CategoryDto(int categoryID, String code, String categoryName, String description) {
        this.categoryID = categoryID;
        this.code = code;
        this.categoryName = categoryName;
        this.description = description;
    }

    public CategoryDto(String code, String categoryName, String description) {
        this.code = code;
        this.categoryName = categoryName;
        this.description = description;
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
     * @return the categoryName
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * @param categoryName the categoryName to set
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
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

    @Override
    public String toString() {
        return "CategoryDto{" + "categoryID=" + categoryID + ", code=" + code + ", categoryName=" + categoryName + ", description=" + description + '}';
    }
    

}
