package com.javacore.learing;

public class Collected {
	
	public Integer CollectedAmount=100;
	
	public Integer collectAmountAndGiveItMe() {
		
		System.out.println("I have collected Amount" + CollectedAmount + "and sent to you");
	
		return CollectedAmount;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collected bysaleem = new Collected();
		Integer Cash = bysaleem.collectAmountAndGiveItMe();
		System.out.println("Amount Given by Son" + Cash);
		
		

	}

}
