package com.java_practice;

import java.util.HashSet;
import java.util.Set;

public class Set_Method {
	
	public static void main(String[] args) {
		
		Set<Object> s = new HashSet<Object>();
		
		s.add(15);
		s.add(24);
		s.add(33);
		s.add(42);
		s.add(51);
		s.add("raj");
		s.add('r');
		
		System.out.println(s);
		
		int size = s.size();
		System.out.println(size);
		
		boolean remove = s.remove('s');
		System.out.println(remove);
		
		boolean contains = s.contains("raj");
		System.out.println(contains);
		
		boolean containsAll = s.containsAll(s);
		System.out.println(containsAll);
	}
	
}
