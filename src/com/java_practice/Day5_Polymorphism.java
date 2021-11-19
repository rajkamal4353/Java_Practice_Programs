package com.java_practice;

public class Day5_Polymorphism {
	
   public void phone_Brand() {
		System.out.println("i_phone_12pro");
        }
        
        public void phone_Brand(int m) {
		System.out.println(m);
        }
        
        public void phone_Brand(String company_name) {
		System.out.println(company_name);
        }
        
        public void phone_Brand(int m, long n, float o, double p, int q) {
    	System.out.println(m+n*o-p/q);
        }
        
        public static void main(String[] args) {
        	
        Day5_Polymorphism r = new Day5_Polymorphism();
        
        r.phone_Brand();
        
        r.phone_Brand(100);
        
        r.phone_Brand("Apple");
        
        r.phone_Brand(100, 123456789, 987654321, 987654321, 50);
   }
}