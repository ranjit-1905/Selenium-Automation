package com.raa.condition_statement;

public class LetsHavetheCoffee {
	
	//data type boolean -true,false
	
	boolean isCupEmpty=false; 
	//boolean isCupEmpty=ture; 

	public static void main(String[] args) {
			// TODO Auto-generated method stub

		LetsHavetheCoffee coffee = new LetsHavetheCoffee();
		
		if(coffee.isCupEmpty){ //in backet ture value
			System.out.println("fill the up");
		}
		else {
			System.out.println("Drink the coffee");
			
			
		}
	}

}
