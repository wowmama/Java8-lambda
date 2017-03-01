package com.troy.java8.methodreference;

import java.util.function.BiFunction;
import java.util.function.Consumer;

import com.troy.java8.greetexample.Greeter;

public class MethodReferenceExample {
	public static void main(String[] args){
		Greeter greeter = new Greeter();
		
		// () -> printSomething()
		greeter.greet(MethodReferenceExample::printSomething); 
		
		// s -> System.out.println(s)
		doSomething("Print from instance method !", System.out::println); 
		
		// (a, b) -> MethodReferenceExample.plus(a, b)
		System.out.println("10 + 5 = " + calculateSomething(10, 5, MethodReferenceExample::plus));
		
		// (a, b) -> MethodReferenceExample.minus(a, b)
		System.out.println("10 - 5 = " + calculateSomething(10, 5, MethodReferenceExample::minus));
		
		// (a, b) -> MethodReferenceExample.times(a, b)
		System.out.println("10 * 5 = " + calculateSomething(10, 5, MethodReferenceExample::times));
		
		// (a, b) -> MethodReferenceExample.divided(a, b)
		System.out.println("10 / 5 = " + calculateSomething(10, 5, MethodReferenceExample::divided));
		
	}

	private static void printSomething() {
		System.out.println("Hello world");
	}
	
	private static void doSomething(Object obj, Consumer<Object> consumer){
		consumer.accept(obj);
	}
	
	private static int calculateSomething(int a, int b, BiFunction<Integer, Integer, Integer> biFunction){
		return biFunction.apply(a, b);
	}
	
	
	private static int plus(int a, int b){
		return a + b;
	}
	
	private static int minus(int a, int b){
		return a - b;
	}
	
	private static int times(int a, int b){
		return a * b;
	}
	private static int divided(int a, int b){
		return a / b;
	}
}
