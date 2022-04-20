package com.example.javafx;

public class Customer {

    private String Fname;
    private String Lname;
    private String Email;
    private String Username;
    private String Password;

    private String UserID;

    public Customer(){

        Fname= " ";
        Lname= " ";
        Email= " ";
        Username= " ";
        Password= " ";
        UserID=" ";
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String fname) {
        Fname = fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String lname) {
        Lname = lname;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String userID) {
        UserID = userID;
    }
}
