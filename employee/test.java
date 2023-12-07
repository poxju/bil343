package com.edu.bil343.employee;

public class test {
     public static void main(String[] args) {
         System.out.println("Number of Employee object: "+ Employee.getCount());

         Date d1 = new Date(10,10,2020);
         Employee e1 = new Employee("erdem",20.00,d1); 
         System.out.println("Number of Employee object: "+ e1.getCount());

         Employee e2 = new Employee();
         System.out.println("Number of Employee object: "+ e2.getCount());
         
         System.out.println(e1.toString());
         System.out.println(e2.toString());

         e2 = null;
         e1 = null;

         System.gc(); // call to garbage collector

         System.out.println("end main...");
     }
}