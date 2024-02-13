package com.pr.abstraction;

public class Benz extends Car{

	
	@Override
	public void engineSecret() {
		System.out.println("Benz Car's Engine Secret");
	}
	@Override
	public void companyVault() {
		System.out.println("Benz Car's Company Vault");
		
	}
	public static void main (String [] args ) {
		Car car=new BMW();
		car.engineSecret();
		car.companyVault();
		
	}
}
