package com.javacore.constructors;

public class Draw {  // Constructors Overloading
	
	String Draw;
	
	Draw() {
	
		System.out.println("Draw object Create");
			
	}
	
	// Having only parameterized constructors and calling no arg constructor
	
	Draw(String toDraw){
		  Draw=toDraw;
		  System.out.println("Drawing "+ toDraw);		  		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Draw draw=new	Draw();
		Draw draw1=new Draw("Cricle");

	}

}
