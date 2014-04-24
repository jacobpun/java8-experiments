package org.punnoose.java8lambda.demo11;

import java.util.List;
import java.util.function.Consumer;

import org.punnoose.java8lambda.commonclasses.Person;
import org.punnoose.java8lambda.commonclasses.TestDataFixture;

/**
 * java.util.function.Consumer Example
 * @author "Punnoose Pullolickal"
 *
 */
public class LambdaExpressionsDemo11 {

	public static void main(String[] args) {
		List<Person> people = new TestDataFixture().getFakePeople();
				
		//increase the age by one
		processList(people, p -> p.setAge(p.getAge()+1));
	
		//Print the list of people on screen
		processList(people,System.out::println);

	}

	private static <T> void processList(List<T> listOfItems, Consumer<T> consumer) {
		for (T item : listOfItems) {
			consumer.accept(item);
		}
	}

}