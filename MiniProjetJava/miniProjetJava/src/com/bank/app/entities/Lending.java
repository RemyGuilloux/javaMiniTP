package com.bank.app.entities;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Lending {
    private TypeOfloan type;
    
    public static void main(String[] args) {
	
	
	// Create a Scanner
	Scanner input = new Scanner(System.in);
	
	// Enter loan amount
	System.out.println("Please entre loan ammout");
	double loanAmount = input.nextDouble();
	System.out.println("amount choose is " + loanAmount +" euros");
	
	// Enter yearly interest rate 
	System.out.println("Please enter yearly interest rate BEETWEEN 1 AND 4% ");
	double annualInterestRate = input.nextDouble();
	System.out.println("your interest year is "+ annualInterestRate +" %");
	
	//Obtain montly interest rate
	double monthlyInterestRate = annualInterestRate / 1200;
	
	// Enter number of years
	System.out.println("Please enter number the number of year BEETWWEN 1 AND 25 YEARS ");
	int numberOfYears = input.nextInt();
	System.out.println("the number of year choose is "+ numberOfYears + "years");
	
	// Enter insurrance rate
	System.out.println("please enter insurrance rate");
	double InsurranceRate = input.nextDouble();
	System.out.println("the inssurance rate choose is "+ InsurranceRate +" %");
	
	// Enter Start date of refunds
	System.out.println("please enter Start date of refunds");
	int StartdateOfRefunds = input.nextInt();
	System.out.println("The Start date of refunds is" + StartdateOfRefunds);
	
	double monthlyPayment = loanAmount * monthlyInterestRate /(1 -1 / Math.pow(1+ monthlyInterestRate,numberOfYears* 12));
	double totalPayment = monthlyPayment * numberOfYears * 12;
	
	double interest =(loanAmount * annualInterestRate * numberOfYears)/100;
	
	System.out.println("you need pay for month is " + monthlyPayment);
	System.out.println("The total payment is" + (int)(totalPayment * 100)/ 100.0);
	System.out.println("le interest Amount is " + interest);
	
	
    }
    
}
