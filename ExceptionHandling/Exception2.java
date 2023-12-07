package com.edu.bil343.ExceptionHandling;

public class Exception2 {
    public static void main(String[] args) {
        System.out.println("Start main.");
        m1();
        System.out.println("End main."); 
    }



public static void m1() {
    System.out.println("Start m1.");
    m2();
    System.out.println("End m1.");
}

public static void m2(){
    System.out.println("Start m2.");
    m3();
    System.out.println("End m2.");
}

public static void m3(){
    int a = 6;
    int b = 0;
    double c = 0.0;
    System.out.println("Start m3.");
    try{    
        c = a/b;
    }
    catch(ArithmeticException ae){
        System.out.println("Caught in m3");
    }
    System.out.println("End m3.");
}

}
