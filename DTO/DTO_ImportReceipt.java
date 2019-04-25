/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.sql.Timestamp;


/**
 *
 * @author phandungtri
 */
public class DTO_ImportReceipt {
    private String id;
    private String staffID;
    private String state;
    private Timestamp createDate;
    
    public DTO_ImportReceipt() {}
    public DTO_ImportReceipt(String id, String staffID, Timestamp createDate, String state) {
        this.id = id;
        this.staffID = staffID;
        this.state = state;
        this.createDate = createDate;
    }

    public String getId() {
        return id;
    }

    public String getStaffID() {
        return staffID;
    }


    public String getState() {
        return state;
    }

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }
    
}
