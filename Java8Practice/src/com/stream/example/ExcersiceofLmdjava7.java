package com.stream.example;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExcersiceofLmdjava7 {

	public static void main(String[] args) {
	
		List<Person> people= Arrays.asList(
				new Person(1,"Charles","Dickens", 60),
				new Person(2,"Lewis","Carroll", 42),
				new Person(3,"Thomos","Carlyle", 51),
				new Person(4,"Charlotte","Bronte", 45),
				new Person(5,"Matthew","Arnold", 39)
				);
				//Step 1: Sort list by last name
		
		Collections.sort(people, new Comparator<Person>(){
			@Override
			public int compare(Person p1 , Person p2) {
				
				return p1.getLastName().compareTo(p2.getLastName());
			}
			
		});
		
		//Step 2: Create amethod that prints all elements in the list
		printAll(people);
		
		
		System.out.println(" ********************* ");
		//Sep3 : create a method that prints all people that have last name begining with C
		printLastNamebeginingwithC(people);

		
	}

	
	

	private static void printLastNamebeginingwithC(List<Person> people) {
		for(Person p: people) {
			if(p.getLastName().startsWith("C")) {
				System.out.println(p);
			}
		}
	}
	
	private static void printAll(List<Person> people) {
		for(Person p:people) {
			System.out.println(p);
		}
		
	}
}
