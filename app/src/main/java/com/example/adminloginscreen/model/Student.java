package com.example.adminloginscreen.model;

public class Student {

   private String userName,registrationNumber,email;

    public Student(String userName, String registrationNumber, String email) {
        this.userName = userName;
        this.registrationNumber = registrationNumber;
        this.email = email;
    }
    public Student(){

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
