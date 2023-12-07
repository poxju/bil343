package com.edu.bil343.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NegativeNumberException extends ArithmeticException { //own class // unchecked
    public NegativeNumberException(){
        //super(); // herturlu var bu mesaj
        super("Number cannot be negative");
    }
    public NegativeNumberException(String msg){
        //super(); // herturlu var bu mesaj
        super(msg);
    }

    public static int readInt() throws NegativeNumberException, InputMismatchException{
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num<0)
            throw new NegativeNumberException();
        return num;
    }
}