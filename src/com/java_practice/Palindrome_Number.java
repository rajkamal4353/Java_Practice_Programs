package com.java_practice;

import java.util.Scanner;

public class Palindrome_Number {
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Your Number");
		
		int k = s.nextInt();
		
		int m = k;
		
		int i = 0, j = 0;
		
		while(k>0) {
			i = k%10;
			j = j * 10 + i;
			k = k/10;
		}
		
		if (m==j) {
			System.out.println("Palindrome Number");
		}
		
		else {
			System.out.println("Not an Palindrome Number");
		}
	}	
}

