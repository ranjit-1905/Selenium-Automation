package com.java.static_keyword;

public class Staticvariable {
	
	static int accountBalance=0;
	static int accountBalance1=0;
	String depositedBy;
	
	//Eaxmple to show, static variables are shared among Objects
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Staticvariable Amount1=new Staticvariable();
		Amount1.accountBalance=1000;
		Amount1.depositedBy="ravi";
		
		Staticvariable Amount2=new Staticvariable();
		Amount2.accountBalance1=2000;
		Amount2.depositedBy="ravikumar";
		
		System.out.println("Amount1 integer :"+Amount1.accountBalance);
		System.out.println("Amount1 integer :"+Amount1.depositedBy);
		System.out.println("Amount2 integer :"+Amount2.accountBalance1);
		System.out.println("Amount2 integer :"+Amount2.depositedBy);

}
}
