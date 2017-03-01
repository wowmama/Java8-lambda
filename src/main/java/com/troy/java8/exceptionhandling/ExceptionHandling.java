package com.troy.java8.exceptionhandling;

import java.util.function.BiConsumer;

public class ExceptionHandling {

	public static void main(String[] args) {
		int [] someNumbers = { 1, 2, 3, 4 };
		int key = 0;
		
//		process(someNumbers, key, (v, k) -> System.out.println(v+k));
//		process(someNumbers, key, (v, k) -> System.out.println(v-k));
//		process(someNumbers, key, (v, k) -> System.out.println(v*k));
		process(someNumbers, key, (v, k) -> System.out.println(v/k));
	}

	private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> consumer) {
		for(int i : someNumbers){
			try{
				consumer.accept(i, key);
			}catch(ArithmeticException e){
				//Do something...
				System.out.println("ArithmeticException happened!");
			}
		}
	}

}
