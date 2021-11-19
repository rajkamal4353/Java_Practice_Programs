package com.java_practice;

import java.util.Scanner;

public class Switch_Statement {
	
    public static void main(String[] args) {
	  Scanner s = new Scanner(System.in);
	  System.out.println("Welcome to Hyundai Showroom");
	  String car = s.nextLine();
	  switch (car) {
	
	case "SUV":
		System.out.println("TUCSON");
		System.out.println("ALCAZAR");
		System.out.println("CRETA");
		System.out.println("VENUE");
		System.out.println("DISCOUNTS available ONLY for DCT Transmission");
		break;
		
	case"SEDAN" :
		System.out.println("ELANTRA");
		System.out.println("VERNA");
		System.out.println("AURA");
		System.out.println("DISCOUNTS available ONLY for DCT Transmission");
		break;
		
	case"HATCHBACK" :
		System.out.println("THE ALL NEW i20");
		System.out.println("GRAND i10 NIOS");
		System.out.println("SANTRO");
		System.out.println("DISCOUNTS available ONLY for DCT Transmission");
		break;
		
	default:
		System.out.println("Unavailable in this Showroom");
		System.out.println("Thank You Visit Again!!");
		break;
	}
	  
    }
}
