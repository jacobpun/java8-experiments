package org.punnoose.java8lambda.demo07;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.punnoose.java8lambda.commonclasses.Person;
import org.punnoose.java8lambda.commonclasses.TestDataFixture;

/*
 * Implementing the "run" method of a Thread using Lambdas
 */
public class LambdaExpressionsDemo7 {

	public static void main(String[] args) {
		ExecutorService pool = Executors.newFixedThreadPool(10);
		List<Person> people = new TestDataFixture().getFakePeople();

		people
			.stream()
			.forEach(
					person -> pool.execute(
							() -> {	doSomethingWith(person);}
					)
			);
		
		pool.shutdown();

	}

	private static void doSomethingWith(Person p) {
		System.out.println(p.getName());
	}
}
