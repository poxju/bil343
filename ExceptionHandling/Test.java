package com.edu.bil343.ExceptionHandling;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        try{
            System.out.println("Enter a number?");
            int num = NegativeNumberException.readInt();
            System.out.println("You entered " + num);
        }
        catch(NegativeNumberException nne){
            System.out.println(nne.getMessage());
        }
        catch(InputMismatchException ime){
            System.out.println(ime.getMessage());
        }
        System.out.println("End main...");
    }
    
}
