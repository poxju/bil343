package com.edu.bil343.Singleton;

public class TestSingleton {
    public static void main(String[] args) {
        Singleton s1 = Singleton.CreateInstance();
        Singleton s2 = Singleton.CreateInstance(); 

        System.out.println(s1.toString());
        System.out.println(s2.toString());

    }
   

}
