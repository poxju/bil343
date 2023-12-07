package com.edu.bil343.employee;
//date class
public class Date {
    private int day;
    private int month;
    private int year;

    public Date(){
        day = 0;
        month = 0;
        year = 0;
    }
    public Date(int day,int month,int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public String toString(){
        return day + "/" + month + "/" + year;
    }

    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }



    protected void finalize(){
        System.out.println("Date object's finalizer called...");
    }

}