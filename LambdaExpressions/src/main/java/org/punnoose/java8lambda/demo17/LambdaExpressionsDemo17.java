package org.punnoose.java8lambda.demo17;

import java.util.List;
import java.util.function.Consumer;

import org.punnoose.java8lambda.commonclasses.Person;
import org.punnoose.java8lambda.commonclasses.TestDataFixture;

/**
 * Chaining Consumers
 * @author "Punnoose Pullolickal"
 *
 */

public class LambdaExpressionsDemo17 {

	private static Consumer<Person> incrementAge = p -> p.setAge(p.getAge()+1);
	private static Consumer<Person> print =System.out::println;
	
	public static void main(String[] args) {
		List<Person> people = new TestDataFixture().getFakePeople();
		
		//increase the age by one & then print
		processList(people, incrementAge.andThen(print));
	}
	
	
	private static <T> void processList(List<T> listOfItems, Consumer<T> consumer) {
		for (T item : listOfItems) {
			consumer.accept(item);
		}
	}
}