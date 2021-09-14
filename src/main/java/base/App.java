package base;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 5 Solution
 *  Copyright 2021 Kenny Dao
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("What is the first number?");
        Scanner num1 = new Scanner(System.in);
        String no1 = num1.next();
        System.out.println("What is the second number?");
        Scanner num2 = new Scanner(System.in);
        String no2 = num2.next();

        int no1conv = Integer.parseInt(no1);            //parse int converts a number represented as a string into an integer
        int no2conv = Integer.parseInt(no2);

        int sum = no1conv + no2conv;                            //Addition
        int difference = no1conv - no2conv;                     //Subtraction
        int multiplication = no1conv * no2conv;                 //Multiplication
        int quotient = no1conv / no2conv;                       //Division

        System.out.println(no1conv + " + " + no2conv + " = " + sum);
        System.out.println(no1conv + " - " + no2conv + " = " + difference);
        System.out.println(no1conv + " * " + no2conv + " = " + multiplication);
        System.out.println(no1conv + " / " + no2conv + " = " + quotient);
    }
}