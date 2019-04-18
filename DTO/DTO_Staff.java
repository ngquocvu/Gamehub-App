/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author AnhhTuann
 */
public class DTO_Staff {
    private String id;
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private String address;
    private String phonenumber;
    private int role;
    private int sex;
    
    public DTO_Staff() {}
    
    public DTO_Staff(String id , String firstname,String lastname,String email,String password,String address,String phonenumber ,int role ,int sex){
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.address = address;
        this.phonenumber = phonenumber;
        this.role =role;
        this.sex=sex;
    }

    public String getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getAddress() {
        return address;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public int getRole() {
        return role;
    }

    public int getSex() {
        return sex;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
    
    
}


