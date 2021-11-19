package com.java_practice;

public class Abstraction1 extends Abstraction{
	
	@Override
	public void mobile_os() {
	System.out.println("Operating_System");
	}
	@Override
	public void android_Snowcone() {
	super.android_Snowcone();
	}
	@Override
	public void apple_14() {
	super.apple_14();
	}
	@Override
	public void blackberry_10() {
	super.blackberry_10();
	}
	@Override
	public void huawei() {
    super.huawei();
	}
	public static void main(String[] args) {
		Abstraction1 a = new Abstraction1();
		a.mobile_os();
		a.android_Snowcone();
		a.apple_14();
		a.blackberry_10();
		a.huawei();
	}
}
