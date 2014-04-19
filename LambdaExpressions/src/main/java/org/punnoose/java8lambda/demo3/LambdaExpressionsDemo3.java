package org.punnoose.java8lambda.demo3;

import java.util.Date;

public class LambdaExpressionsDemo3 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Date localVariable = new Date();

		// Lambdas can access local variables even if not explicitly declared as final.
		MyInterface m1 = () -> {
			return localVariable;
		};

		// However, lambdas cannot modify local variables
		MyInterface m3 = () -> {
			// localVariable = new Date(); //ERROR at this line since lambdas
			// cannot modify local variables
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
	// Date myMethod2(); //ERROR at this line since only one method is allowed
	// within a functional interface
}