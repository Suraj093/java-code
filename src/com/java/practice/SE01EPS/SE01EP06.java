package com.java.practice.SE01EPS;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SE01EP06 {
	public static void main(String[] args) {
		
		// Example 1: Java program to collect even numbers from the list using Stream.
		
		System.out.println("Welcome to programming world..");
		
		System.out.println("*******************************");
		
		List<Integer> firstList = new ArrayList<>();
		
		for(int i = 0; i < 20; i++) {
			firstList.add(i);
		}
		
		System.out.println(firstList);
		
		System.out.println("********************************");
		
		List<Integer> collect = firstList.stream().filter(i -> i % 2 == 0)
				.collect(Collectors.toList());
		
		System.out.println(collect);
		
	}

}
