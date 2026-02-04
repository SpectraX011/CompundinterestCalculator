/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.compundinterestcalculator;

/**
 *
 * @author Nullroot 13
 */
import java.util.Scanner;
public class CompundinterestCalculator {
    public static void main(String[] args) {
        // compound interest calculator
        
        Scanner scanner = new Scanner(System.in);
        
        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;
        
        
        System.out.println("eneter the principal amount:");
        principal = scanner.nextDouble();
        
        System.out.println("ENter the interest rate (in %):");
        rate = scanner.nextDouble() / 100;
        
        System.out.println("enter the # of times compoundd per year:");
        timesCompounded = scanner.nextInt();
        
        
        System.out.println("Enter the # of years: ");
        years = scanner.nextInt();
        
        amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);
        
        System.out.printf("The amount after %d years is %.2f", years, amount);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        scanner.close();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
