package com.java.practice.SE01EPS;

import java.util.function.Predicate;

public class SE01EP02 {

	public static void main(String[] args) {

		System.out.println("Welcome to programming world..");

		Predicate<String> checkStringLenght = str -> {
			if (str.charAt(0) == 'A') {
				return true;
			}
			return false;

		};

		if (checkStringLenght.test("Suraj")) {
			System.out.println("Letter start with A");
		} else {
			System.out.println("Letter not start with A");
		}

	}

}
