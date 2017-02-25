package com.troy.java8.greetexample;

public class Greeter {
	
	public void greet(Greet greet){
		greet.greet();
	}
	
	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		Greet enGreet = new EnGreet();
		greeter.greet(enGreet);
		
		Greet chGreet = new ChGreet();
		greeter.greet(chGreet);
		
		greeter.greet(new Greet(){
			public void greet() {
				System.out.println("©_Å]¤l");
			}
		});
	}
}
