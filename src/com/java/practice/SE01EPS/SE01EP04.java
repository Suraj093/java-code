package com.java.practice.SE01EPS;

import java.util.ArrayList;
import java.util.List;

public class SE01EP04 {

	public static void main(String[] args) {
		System.out.println("Welcome to programing world..");

		System.out.println("************************************");

		List<String> str = new ArrayList<>();
		str.add("Suraj");
		str.add("Kushwaha");
		str.add("Anya");
		str.add("Kushwaha");

		printList(str);
	}

	public static void printList(List<String> list) {

		for (String items : list) {
			System.out.println(items + "");
		}

	}

}
