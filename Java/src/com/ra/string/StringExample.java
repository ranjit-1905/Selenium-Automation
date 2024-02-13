package com.ra.string;



public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="ranjith.raghavan"; //String literal
		int number=3;
		
		//return Charater value for the particular index
		System.out.println(name.charAt(5));
		
		//return string length
		System.out.println(name.length());
		
		//check the equality of string with given object
		System.out.println(name.equals("kumaran"));
		System.out.println(name.equals("ranjith.raghavan"));
		
		//check the equality of string with given object without case sensitivity
		System.out.println(name.equalsIgnoreCase("raghavan"));
		System.out.println(name.equalsIgnoreCase("ranjith.raghavan"));
		
		//check if string is empty or not
		System.out.println(name.isEmpty());
		
		//returns true or false based on the given value is present or not
		System.out.println(name.contains("r"));
		
		//take a particular portion of the string 
		System.out.println(name.substring(2));
		
		//take a particular portion of the string begin and end index
		System.out.println(name.substring(2,5));
		
		//appends the string to the given string
		System.out.println(name.replace("r","R "));
		System.out.println(name.replace("raghavan", "R"));
		
		//find the position of character in the string
		System.out.println(name.indexOf("r"));
		//find the character specified from the index postion
		System.out.println(name.indexOf("j",5));
		//find the character specified from the index postion
		System.out.println(name.indexOf('i',2));
		System.out.println(name.indexOf("jith",1));
		
		//trim will remove the white space before and after
		System.out.println(name.trim());
		
		//convert the given data type to String
		System.out.println("number covert to string" + String.valueOf(number));
		
		String upperCase="raghavan";
		System.out.println(upperCase.toUpperCase());
		
		String LowerCase="raghavan";
		System.out.println(LowerCase.toLowerCase());
		
		//Return a joined String with given delimiter
		System.out.println(String.join("*","HTC","INDIA"));
		System.out.println(String.join("/","06","02","2024"));
		
		//Continue the two word
		System.out.println(name.concat("Ravi"));
		
		//Split
		String splitThis = "Salesforce Commerce Cloud is a cloud-based ,platform that helps e-commerce businesses set up sites ";
		String[] splittedWords=splitThis.split(" ,");
		for (String string: splittedWords){
		System.out.println(string);
	
		
		}
		
		
		
		
		
		
		
	}

}
