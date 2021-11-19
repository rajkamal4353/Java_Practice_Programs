package com.java_practice;

import java.util.Scanner;

public class If_Else_Condition {
	
    public static void main(String[] args) {
    	
	    Scanner s = new Scanner(System.in);
	    System.out.println("Welcome to BLUE DIAMOND JEWELLERS");
		System.out.println("Enter Your Grams");
		System.out.println("Gold");
		
		int grams = s.nextInt();
		if (grams<=1) {
			System.out.println("Rs.4,750");
		}else if (grams>1 && grams<=4) {
			System.out.println("Rs.14,250");
		}else if (grams>=5 && grams<=8) {
			System.out.println("Rs.38,000");
		}else {
			System.out.println("- - - - - -");
		}
		
		System.out.println("Enter Your Grams");
		System.out.println("Silver");
		
		int grams1 = s.nextInt();
		if (grams1<=10) {
			System.out.println("Rs.625");
		}else if (grams1>10 && grams1<=20) {
			System.out.println("Rs.1,250");
		}else if (grams1>=21 && grams1<=30) {
			System.out.println("Rs.1,875");
		}else {
			System.out.println("- - - - - -");
		}
		
		System.out.println("Thank you Visit Again!!");
	}
}