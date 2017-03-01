package com.troy.java8.lambdaexercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExercise {

	

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
					new Person("Charles", "Dickens", 60),
					new Person("Lewis", "Carroll", 42),
					new Person("Thomas", "Carlyle", 51),
					new Person("Charlatte", "Bronte", 45),
					new Person("Matthew", "Arrold", 39)
				);
		
		//用lastName分類
		Collections.sort(people, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});
		
		//寫個function因出所有人的資訊
		printAll(people);
		
		//寫個方法印出lastName開頭是C的人
		printConditionally(people, new Condition() {
			public boolean test(Person p) {
				return p.getLastName().startsWith("C");
			}
		});
		
	}
	
	private static void printConditionally(List<Person> people, Condition condition) {
		for(Person p : people){
			if(p.getLastName().startsWith("C")){
				System.out.println(p);
			}
		}
	}

	private static void printAll(List<Person> people) {
		for(Person p : people){
			System.out.println(p);
		}
	}

}

interface Condition {
	boolean test(Person p);
}
