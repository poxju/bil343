package com.edu.bil343.Singleton;

public class Singleton {
    private int a;
    private static Singleton instance = null;

    private Singleton(){
            this.a = 0;
    }

    public synchronized static Singleton CreateInstance(){
        if(instance == null)
            instance = new Singleton();
        return instance;
    }
}
