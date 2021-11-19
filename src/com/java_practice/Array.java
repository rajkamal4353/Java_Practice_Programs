package com.java_practice;

public class Array {
	
	    public static void main(String[] args) {
		int r [] = new int[8];
		
		r[0]=8;
		r[1]=17;
		r[2]=26;
	    r[3]=35;
		r[4]=44;
	    r[5]=53;
		r[5]=62;
		r[6]=60;
		
		System.out.println(r.length);
		System.out.println(r[5]);
		
		for (int i = 0; i < r.length; i++){
		    System.out.print(r[i]+",");
		}
		
		int s[] = {0,6,15,24,33,42,51,60};
		    System.out.println();
		    System.out.println();
		    System.out.println(s.length);
		    System.out.println(s[3]);
	
		for (int arr : s){
		    System.out.print(arr +",");
        }
	    } 
}