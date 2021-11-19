package com.java_practice;

public class Lap {
	
   public Lap() {
	 System.out.println("Laptop:-");
	 }
	
	 public Lap(String t) {
     System.out.println("Brand Name - "+t );
	 }
	
	 public Lap(String k,String u,int v) {
	 System.out.println(k+ u+ v);
	 }
	
	 public Lap(String name,long w ) {
	 System.out.println(name+ w);
	 }
	
	 public static void main(String[] args) {
		
	 Lap l = new Lap();
	
     Lap l1 = new Lap("ASUS");
    
     Lap l2 = new Lap("Model - ","TUF", 15);
    
     Lap l3 = new Lap("Barcode Number : ", 692346754);
    
     }
	
}
