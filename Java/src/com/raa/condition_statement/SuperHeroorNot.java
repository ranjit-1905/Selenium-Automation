package com.raa.condition_statement;

public class SuperHeroorNot {
	
      String hero ="ranjini";

    public void heroornot() {
    	
    }
    		  
	public void heroorNot() {
		// TODO Auto-generated method stub
		
		switch (hero) {
		case "ranjini":
			System.out.println("ranjini is a Superhero");
			break;
		case "Iron man":
			System.out.println("Iron man is a Superhero");
			break;
		case "bat man":
			System.out.println("bat man is a Superhero");
			break;
				
		default:
			System.out.println(hero +"Sorry i Don't the super hero");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperHeroorNot heroorNots=new SuperHeroorNot();
		heroorNots.heroorNot();
	}
		
		
		
		
	
}
