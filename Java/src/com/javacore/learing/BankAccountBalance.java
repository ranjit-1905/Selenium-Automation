package com.javacore.learing;


public class BankAccountBalance {  // data
	
	Long accountNumber =58799777L;
	
	String AccountHolderName= "Ranjith.R";
	
	Integer AccountBalanceAmount=1500;
	
	public void getbalance() {   //Function //user defined methods
		System.out.println("balance is"+ AccountBalanceAmount );
		
		}
	public static void main (String[] arg) {  //object need to creat for the main function  //  bulid in methods
		
		//ClassName objname= new ClassName()
		BankAccountBalance accountBalance=new BankAccountBalance();
		accountBalance.getbalance();
		
	}
}

