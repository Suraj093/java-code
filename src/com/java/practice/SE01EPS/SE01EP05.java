package com.java.practice.SE01EPS;

import java.util.ArrayList;
import java.util.List;

public class SE01EP05 {

	public static void main(String[] args) {

		// Example 1: Java program to collect even numbers from the list.

		System.out.println("Welcome to programming world..");

		System.out.println("*********************************");

		List<Integer> firstList = new ArrayList<>();

		for (int i = 0; i < 20; i++) {
			firstList.add(i);
		}

		System.out.println(firstList);

		System.out.println("*********************************");

		List<Integer> secondList = new ArrayList<>();
		for (int i = 0; i < 20; i++) {
			if (i % 2 == 0) {
				secondList.add(i);
			}
		}
		
		System.out.println(secondList );

	}

}
