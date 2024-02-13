package com.ra.your;
  

public class your{
	
	/*on a fine evening, a guy is giving weried faces to his upset
	   * girlfriend when she is at her balnocy to make laugh.her
	   * brother noticed this and come to beat him -> Exception 
	   * how to handle This??
	   * 
	   */
	public void  makegirlfrilaugh() {
	try {
		throw new Exception("machan is coming to hit you");
		
	}  catch(Exception e){
		 
		//e.printStackTrace();
		System.out.println("Your friends : Machan given this posa da.");
	    System.out.println("and you are Acting like you are possing For Facebook");
	
		
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		your laugh=new your();
	   laugh.makegirlfrilaugh();
		
	}

}

