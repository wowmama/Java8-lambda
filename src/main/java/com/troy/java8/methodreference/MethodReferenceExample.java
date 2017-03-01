package com.troy.java8.methodreference;

import com.troy.java8.greetexample.Greeter;

public class MethodReferenceExample {
	public static void main(String[] args){
		Greeter greeter = new Greeter();
		
		greeter.greet(() -> System.out.println("Hello world"));
	}
}
