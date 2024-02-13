package com.ra.your;

public class TryCatchFinallyImportantConcepts {

	public static int dummy() {
		return 3;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			System.out.println("Inside try Block");
			System.exit(0);
			//System.out.println(2/0);
			System.out.println(TryCatchFinallyImportantConcepts.dummy());
			System.out.println("After Exception");
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Inside Catch Block");
		}
		finally {
			System.out.println("Inside Finally Block");
		}

	}

}
