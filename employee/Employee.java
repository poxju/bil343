package com.edu.bil343.employee;

public class Employee {
    private String name;
    private double salary;
    private Date hireDate;
    private static int count;

    public Employee(){
        count++;
        name = "";
        salary = 0.0;
        this.hireDate = new Date();
    }
    public Employee(String name, double salary, Date hireDate){
        count++;
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    static { // static block

    }
    
    public String toString(){
        return "Employee(" + name + "," + salary + "," + hireDate.toString() + ")";
    }

    public static int getCount(){
        return count;
    }
}
