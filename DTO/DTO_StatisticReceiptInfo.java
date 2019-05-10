/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DTO;

import java.sql.Date;


public class DTO_StatisticReceiptInfo {
    private String productID;
    private String productName;
    private int quantity;
    private double price;
    private String staffID;
    private String staffName;
    private String customerID;
    private String customerName;
    private Date date;
    public DTO_StatisticReceiptInfo() {
    }

    public DTO_StatisticReceiptInfo(String productID, String productName, int quantity, double price, String staffID,Date date, String staffName, String customerID, String customerName) {
        this.productID = productID;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
        this.staffID = staffID;
        this.staffName = staffName;
        this.customerID = customerID;
        this.customerName = customerName;
        this.date = date;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setDate(Date date)
    {
        this.date = date;
    }
    
    public String getProductID() {
        return productID;
    }
    
    
     public Date getDate() {
        return date;
    }


    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public String getStaffID() {
        return staffID;
    }

    public String getStaffName() {
        return staffName;
    }

    public String getCustomerID() {
        return customerID;
    }

    public String getCustomerName() {
        return customerName;
    }
    
}
