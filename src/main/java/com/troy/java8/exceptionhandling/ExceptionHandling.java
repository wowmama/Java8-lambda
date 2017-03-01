package com.troy.java8.exceptionhandling;

import java.util.function.BiConsumer;

public class ExceptionHandling {

	public static void main(String[] args) {
		int [] someNumbers = { 1, 2, 3, 4 };
		int key = 0;
		
//		process(someNumbers, key, (v, k) -> System.out.println(v+k));
//		process(someNumbers, key, (v, k) -> System.out.println(v-k));
//		process(someNumbers, key, (v, k) -> System.out.println(v*k));
		
		process(someNumbers, key, wrapper((v, k) -> System.out.println(v/k)));
	}

	private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> consumer) {
		for(int i : someNumbers){
			consumer.accept(i, key);
		}
	}
	
	private static BiConsumer<Integer, Integer> wrapper(BiConsumer<Integer, Integer> consumer){
		return (v, k) -> {
			try{
				consumer.accept(v, k);
			}catch(ArithmeticException e){
				//Do something...
				System.out.println("ArithmeticException happened!");
			}
		};
	}

}
