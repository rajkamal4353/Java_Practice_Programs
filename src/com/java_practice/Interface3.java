package com.java_practice;

public class Interface3 implements Interface2, Interface1 {
	
	@Override
	public void cycle() {
	System.out.println("hercules");
	}
	@Override
	public void bike() {
	System.out.println("yamaha_rx100");
	}
	@Override
	public void car() {
	System.out.println("hyundai_i20");
	}
	@Override
	public void name() {
	System.out.println("rajkamal");
	}
    @Override
	public void pincode() {
	System.out.println("641112");
	}
    @Override
	public void phone_Number() {
	System.out.println("9876543210");
	}
    public static void main(String[] args) {
    	Interface3 i = new Interface3();
    	i.cycle(); i.bike(); i.car();
    	i.name(); i.pincode(); i.phone_Number();	
	}
    
}
