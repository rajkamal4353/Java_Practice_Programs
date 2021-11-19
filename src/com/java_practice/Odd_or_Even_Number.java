package com.java_practice;

import java.util.Scanner;

public class Odd_or_Even_Number {
	
	public static void main(String[] args) {
		
		Scanner v = new Scanner(System.in);
        System.out.println("Enter your Number");  
        
        int w = v.nextInt();
        
        if (w%2==0) {
			System.out.println("Even Number");
		}
        else {
			System.out.println("Odd  Number");
		}
        
	}
	
}
