package com.java.practice.SE01EPS;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SE01EP07 {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to programming world..");
		
		System.out.println("********************************");
		
		// Example 2: Java program to illustrate the map() and collect() method of Java 1.8 Stream.
	
		List<Integer> firstList = new ArrayList<>();
		
		for(int i = 0; i < 20; i++) {
			firstList.add(i);
		}
		
		System.out.println(firstList);
		
		System.out.println("******************************************");
		
		List<Integer> collect = firstList.stream().map(i -> i * 2)
				.collect(Collectors.toList());
		
		System.out.print(collect);
		
	}

}
