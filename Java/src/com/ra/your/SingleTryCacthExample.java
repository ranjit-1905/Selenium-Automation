package com.ra.your;

public class SingleTryCacthExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int number1=0;
			int number2=3;
			int result=number2/number1;
			System.out.println(result);
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("Don't Divide the number with zero");
		} 
		catch(NullPointerException e) {
			e.printStackTrace();
			System.out.println("this is due to null point Exception");
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("Don't Divide the number with zero");
		} 
		
	}

}
