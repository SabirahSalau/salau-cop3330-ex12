/*
 *  UCF COP3330 Summer 2021 Assignment 12 Solution
 *  Copyright 2021 Sabirah Salau
 */


package org.example;
import java.util.Scanner;

public class Problem12
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        //INPUTS
        System.out.println("Enter the principal:");
        double principal = input.nextDouble();

        System.out.println("Enter the rate of interest as a percentage:");
        double rate = input.nextDouble();

        System.out.println("Enter the number of years:");
        double years = input.nextDouble();


        //CALCULATION
        double amount = principal * (1 + ((rate/100) * years));


        //OUTPUT
        System.out.println("After " + Math.round(years) + " years at " + rate + "%, the investment will be worth $" + Math.round(amount) + ".");

    }
}
