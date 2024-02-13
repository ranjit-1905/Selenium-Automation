package com.pr.abstraction;

public class BMW extends Car implements UpcomingProject,Interface2{
	
	@Override
	public void engineSecret() {
		System.out.println("BMV Car's Engine Secret");
	}
	@Override
	public void companyVault() {
		System.out.println(" BMV Car's Company Vault");
		
	}
	public static void main (String [] args ) {
		
		Car car=new BMW();
		car.engineSecret();
		car.companyVault();
		
	}
	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("this is Method2");
		
		
	}
	@Override
	public void method3() {
		// TODO Auto-generated method stub
		System.out.println("this is Method3");
		
	}

}
