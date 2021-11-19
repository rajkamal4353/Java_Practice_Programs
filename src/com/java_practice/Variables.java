package com.java_practice;

public class Variables {
	
	static int y = 2021;
	
	static String c = "Tesla";
	static String m = "X";
	static int b = 8;
	
	public static void Year() {                       // Class Variables
	System.out.println("Year:" + y);
	}
	
	public static void Service() {                    // Local Variables
	int s = 1;
	System.out.println("Service:" + s);	
	}
	
	public static void Car_Name() {                   // Static Variables
	System.out.println("Car_Name:" + c);
	}
	
	public static void Model() {
	System.out.println("Model:" + m);
	}
	
	public static void Month() {
	System.out.println("Month:" + b);
	}
	
	public static void main(String[] args) {
		Car_Name();
		Model();
		Month();
	    Year();
	    Service();
	    
    }
	
}