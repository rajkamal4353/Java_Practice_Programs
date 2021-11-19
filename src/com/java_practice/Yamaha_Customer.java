package com.java_practice;

public class Yamaha_Customer extends Yamaha_Dealership {
	
	@Override
	public void new_Bike(String new_Bike) {
    super.new_Bike(new_Bike);
	}
	
    @Override
    public void price(float p) {
	super.price(p);
    }
    
    @Override
    public void customer_Name(String name) {
    super.customer_Name(name);
    }
    
    @Override
    public void customer_Phno(long n) {
    super.customer_Phno(n);
    }
    
    public void old_Bike() {
    System.out.println("R15");
	}
    
    
    public static void main(String[] args) {
    	
    Yamaha_Customer	y = new Yamaha_Customer();
    y.new_Bike("MT-15");
    y.price(166542);
    y.customer_Name("Rajkamal");
    y.customer_Phno(918273645);
    y.old_Bike();
    
	}
    
}
