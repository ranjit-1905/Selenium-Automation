package com.ra.string;



public class StringBufferExample {
       // Like String we have charAt,Substring,lenght methods as Well
	

	public static void main(String[] args) {
		// To demonstrate the string Buffer is Mutable
		
		System.out.println(" String is IMMUTABLE");
		String name="Ranjith";
		System.out.println("Appending a name to Original : "+ name.concat("Raghavan"));
		System.out.println("Original Name :"+name);
		System.out.println("_______________________________");
		System.out.println("StringBuffer is IMMUTABLE");
		StringBuffer name1=new StringBuffer("Ranjith");
		System.out.println("Appending a name to Original :" + name1.append("Raghavan"));
		System.out.println("Original Name :"+name1);
		
		System.out.println("_______________________________");
		//StringBuffer Methode
		//Reverse
		System.out.println("Reverse name:"+ name1.reverse());
		//Replace
		System.out.println("_______________________________");
	    StringBuffer replaceThis=new StringBuffer("Ranjith");
	    System.out.println(replaceThis.replace(0, 3, "ranjith"));
		System.out.println("_______________________________");
		//delete
		StringBuffer delete=new StringBuffer("Ranjith");
		System.out.println(delete.delete(0, 3));
		//Insert
		System.out.println("_______________________________");
		StringBuffer insert= new StringBuffer("Ranjith"); 
		System.out.println(insert.insert(0, "R"));
		//capacity
		System.out.println("_______________________________");
		System.out.println(insert.capacity());
		
		
	    
		
		
		
	}
}
