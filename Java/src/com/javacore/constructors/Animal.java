package com.javacore.constructors;

public class Animal {   // argument(parameters)
	
  String animal_name;
	String animal_Type;
	
	Animal(String name,String Type){
		animal_name=name;
				animal_Type=Type;
	}

	public void sayAboutAnimal() {
		
		// TODO Auto-generated method stub
		System.out.println("Animal name is:- "+animal_name);
		System.out.println("Animal Type :-" + animal_Type);
	}
		
		public static void main (String[] args) {
			Animal animal1=new Animal("Lion","Man Eater");
			animal1.sayAboutAnimal();
			
			Animal animal2=new Animal("Tiger","Man Eater");
			animal2.sayAboutAnimal();
			
			
			
		}
	

}
