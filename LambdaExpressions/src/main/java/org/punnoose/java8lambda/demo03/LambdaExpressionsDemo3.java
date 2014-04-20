package org.punnoose.java8lambda.demo03;

import java.util.Date;

/**
 * Lambdas and local variables
 */
public class LambdaExpressionsDemo3 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Date localVariable = new Date();

		// Lambdas can access local variables even if not explicitly declared as
		// final.
		MyInterface m1 = () -> {
			return localVariable;
		};

		// However, lambdas cannot modify local variables
		MyInterface m3 = () -> {
			// localVariable = new Date(); //ERROR here
			return localVariable;
		};
	}
}

/*
 * Only one method is allowed within a functional interface
 */
@FunctionalInterface
interface MyInterface {
	Date myMethod();
	// Date illegalMethod(); //ERROR here
}