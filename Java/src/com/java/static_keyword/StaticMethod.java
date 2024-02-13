package com.java.static_keyword;

public class StaticMethod {
	
	public static void method1() {
		System.out.println("Static Method");
	}

	public  void nonstaitcmethod() {
		method1();
		System.out.println("non-staitc method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		method1();
		
		StaticMethod staticMethod=new StaticMethod();
		staticMethod.nonstaitcmethod();
		
		
	}

}
