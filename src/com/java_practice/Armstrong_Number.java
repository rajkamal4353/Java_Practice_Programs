package com.java_practice;

import java.util.Scanner;

public class Armstrong_Number {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Your Number");
		
		int k = s.nextInt();
		
		int m = k;
		
		int i = 0, j = 0;
		
		while(k>0) {
			i = k%10;
			j = j + (i*i*i);
			k = k/10;
		}
		
		if (m==j) {
			System.out.println("Armstrong Number");
		}
		
		else {
			System.out.println("Not an Armstrong Number");
		}
	}	
}
