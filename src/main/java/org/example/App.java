/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Nikolai Coletta
 */
package org.example;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        System.out.print( "Enter the first number: " );
        int num1 = Integer.parseInt( scan.nextLine() );
        System.out.print( "Enter the second number: " );
        int num2 = Integer.parseInt( scan.nextLine() );
        System.out.print( "Enter the third number: " );
        int num3 = Integer.parseInt( scan.nextLine() );

        int largest = (num1 > num2 ? num1 : num2);
        largest = (largest > num3 ? largest : num3);

        System.out.println( "The largest number is " + largest + "." );
    }
}
