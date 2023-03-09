package com.java.practice.SE01EPS;

import java.util.function.Predicate;

public class SE01EP03 {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to programming world..");
		
		System.out.println("*************************************");
		
		Predicate<String> p = l -> {
			
			boolean isLengthGreateThan20 = false;
			
			if(l == null || l.isEmpty()) {
				isLengthGreateThan20 = false;
			}
			
			if(l.length() > 20) {
				isLengthGreateThan20 = true;
			}
			
			return isLengthGreateThan20;
			
		};
		if(p.test("WelcomeToProgrammingWorld")) {
			System.out.println("Length is greather than 20 ");
		}else {
			System.out.println("Length is smaller than 20 ");
		}
		
	}

}
