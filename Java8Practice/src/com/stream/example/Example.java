package com.stream.example;

import java.util.*;

public class Example {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Ajeet");
		names.add("Negan");
		names.add("Aditya");
		names.add("Steve");
		/*
		 * int count = 0; for (String str : names) { if (str.length() < 6) count++;
		 * System.out.println("There are " +str+ " strings with length less than 6 "); }
		 * System.out.println("There are "+count+" strings with length less than 6");
		 */	
		long count = names.stream().filter(str->str.length()<6).count();
		System.out.println("There are "+count+" strings with length less than 6");	
	}

}
