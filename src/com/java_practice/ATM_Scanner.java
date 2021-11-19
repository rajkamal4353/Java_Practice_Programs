package com.java_practice;
import java.util.Scanner;

public class ATM_Scanner {
	
	public static void main(String[] args) {	
	    	
	    Scanner s = new Scanner(System.in);
	    
		System.out.println("Welcome to HDFC Bank");
		
		System.out.println("Insert your card");
	    String card = s.nextLine();
	    System.out.println(card);
	    
	    System.out.println("Enter your pin number");
	    int pin = s.nextInt();
	    System.out.println(pin);
	    
	    System.out.println("Select your account");
	    String ac = s.next();
	    System.out.println(ac);
	    
	    System.out.println("Enter your amount");
	    String amount = s.next();
	    System.out.println(amount);
	    
	    System.out.println("Do you want receipt");
	    System.out.println("yes or no");
	    String receipt = s.next();
	    System.out.println(receipt);
	    
	    System.out.println("Rate our service out of 10");
	    int rate = s.nextInt();
	    System.out.println(rate);
	    
	    System.out.println("Thank You!! Visit Again!!");  
	    
	}
	
}
