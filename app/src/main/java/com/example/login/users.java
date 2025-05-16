package com.example.login;

public class users {
    private int id;
    private String fullname;
    private String email;
    private String DOB;
    private String phonenumber;
    private String password;

    public users(int id, String fullname, String email, String DOB, String phonenumber, String password) {
        this.id = id;
        this.fullname = fullname;
        this.email = email;
        this.DOB = DOB;
        this.phonenumber = phonenumber;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
