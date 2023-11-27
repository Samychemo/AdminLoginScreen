package com.example.adminloginscreen.model;

public class Result {

    private String exam,assignment1,assignment2,cat1,cat2;

    public Result(String exam, String assignment1, String assignment2, String cat1, String cat2) {
        this.exam = exam;
        this.assignment1 = assignment1;
        this.assignment2 = assignment2;
        this.cat1 = cat1;
        this.cat2 = cat2;
    }

    public Result(){

    }

    public String getExam() {
        return exam;
    }

    public void setExam(String exam) {
        this.exam = exam;
    }

    public String getAssignment1() {
        return assignment1;
    }

    public void setAssignment1(String assignment1) {
        this.assignment1 = assignment1;
    }

    public String getAssignment2() {
        return assignment2;
    }

    public void setAssignment2(String assignment2) {
        this.assignment2 = assignment2;
    }

    public String getCat1() {
        return cat1;
    }

    public void setCat1(String cat1) {
        this.cat1 = cat1;
    }

    public String getCat2() {
        return cat2;
    }

    public void setCat2(String cat2) {
        this.cat2 = cat2;
    }
}
