package org.punnoose.java8lambda.demo1;


/**
 * A Simple Hello World Example using Lambda Expressions
 */
public class LambdaExpressionDemo1 {
	public static void main(String[] args) {
		
		GreetingService service1 = s -> "Hello " + s;
		System.out.println(service1.greet("World"));
		
		GreetingService service2 = s -> "¡Hola " + s;
		System.out.println(service2.greet("Mundo"));
		
	}
}

@FunctionalInterface
interface GreetingService{
	public String greet(String name);
}