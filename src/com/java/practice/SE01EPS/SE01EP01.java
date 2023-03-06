package com.java.practice.SE01EPS;

import java.util.function.Predicate;

public class SE01EP01 {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to programming world..");
		
		System.out.println("***********************************");
		
		Predicate<Integer> p= m -> m > 20;
		
		if(p.test(30)) {
			System.out.println("Number is grater than the given number");
		}else {
			System.out.println("Number is not grater than the given number");
		}
		
	}

}
