package com.ra.ploymorphism;

public class Addion { //overload//

	int add (int n1,int n2) 
	{
		return n1+n2;
			}
	int add (int n1,int n2,int n3)
	{
		return n1+n2+n3;
		
	}
	float add (float n1, float n2)
	{
		return n1+n2;
		
	}
	
	public static void main(String[] args) {
			// TODO Auto-generated method stub
        Addion obj=new Addion();
        System.out.println("sum of two numbers :" + obj.add(20,22));
        System.out.println("sum of three numbers :" + obj.add(20,22,23));
	}

}
