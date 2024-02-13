package com.ra.ploymorphism;

public class TheWayWeTalk {

	/*This Class is to illustrate method overloading
	with a practical Example*/
	
	public void talk (Parents styleoftalking) {
		
		System.out.println("Polite,Respectfull????");
		}
	
	public void talk(Partner styleoftalking) {
	   System.out.println("Love,Romatic,Mixture of Everying");	
	}
		public void talk(Boss styleoftalking) {
		System.err.println("Nothing Personal");
	}
		
		public static void main (String[] args) {
			
			TheWayWeTalk talk=new TheWayWeTalk();
			
			Parents parents=new Parents();
			talk.talk(parents);
			
		    Boss boss=new Boss();
		    talk.talk(boss);
		    
		    Partner Partner=new Partner();
		    talk.talk(Partner);
		    
			
			
		}
}
