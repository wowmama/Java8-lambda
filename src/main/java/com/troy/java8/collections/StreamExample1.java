package com.troy.java8.collections;

import java.util.Arrays;
import java.util.List;

import com.troy.java8.lambdaexercise.Person;

public class StreamExample1 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charlatte", "Bronte", 45),
				new Person("Matthew", "Arrold", 39)
			);
		
		people.stream()
			.filter(p -> p.getLastName().startsWith("C"))
			.forEach(System.out::println);
	}

}
