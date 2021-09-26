package com.example.naturelife;


public class User {

    private String username;
    private String address;
    private  String Email;
    private String NIC;
    private String Password;
    private String REPassword;


    public User(String code, String price, String title, String description){}

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getNIC() {
        return NIC;
    }

    public void setNIC(String NIC) {
        this.NIC = NIC;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getREPassword() {
        return REPassword;
    }

    public void setREPassword(String REPassword) {
        this.REPassword = REPassword;
    }

    public User(String username, String address, String Email, String NIC, String Password, String REPassword) {
        this.username = username;
        this.address = address;
        this.Email = Email;
        this.NIC = NIC;
        this.Password = Password;
        this.REPassword = REPassword;

    }


}
