package com.ra.ploymorphism;

public class Son extends Parents {  //@Override

	/*
	 * This class is to illustrate method overriding with a practical Example
	 */

	@Override
	 public void marriage() {
		System.out.println(" SON My Marriage My Rules!");

	}

	public static void main(String[] args) {

		Parents parents = new Son(); // ParentClass ref=new Childclass();
		parents.properties();
		parents.marriage();

	}

}
