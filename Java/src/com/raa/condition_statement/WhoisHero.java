package com.raa.condition_statement;

public class WhoisHero {

	String myheroname="rajini";
	
	public void superHeroGuesser() {
		
		if (myheroname.equals("iron man")) {
			System.err.println("Your thought about iron man");
		}else if(myheroname.equalsIgnoreCase("Rajini")) {
			System.out.println("Your thought about rajini");
		}else if(myheroname.equals("spider man")) {
			System.out.println("Your thought about Spider man");
		}else {
			System.out.println("Sorry I Can't guess!!!");
		}
	}
	
	public static void main(String[] args) {
				// TODO Auto-generated method stub

		WhoisHero Hero=new WhoisHero();
		Hero.superHeroGuesser();
	}

}
