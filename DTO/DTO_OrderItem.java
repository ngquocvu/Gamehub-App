/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DTO;

/**
 *
 * @author Vu Nguyen
 */
public class DTO_OrderItem {
    private String orderID;
    private String productID;
    private String productName;
    private double price;
    private int quantity;

    public DTO_OrderItem(String orderID, String productID, String productName, double price, int quantity) {
        this.orderID = orderID;
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public DTO_OrderItem() {
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }


    public String getOrderID() {
        return orderID;
    }

    public String getProductID() {
        return productID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
}
