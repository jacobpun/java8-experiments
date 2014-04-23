package org.punnoose.java8lambda.demo09;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import org.punnoose.java8lambda.commonclasses.Person;
import org.punnoose.java8lambda.commonclasses.TestDataFixture;

/**
 * Functions Demo
 * @author "Punnoose Pullolickal"
 *
 */
public class LambdaExpressionsDemo9 {
	public static void main(String[] args) {

		List<Person> people = new TestDataFixture().getFakePeople();

		// Function - Lambda Style.
		List<String> peopleName = transform(people, p -> p.getName());
		System.out.println(peopleName);

		// Function - Method Reference Style.
		peopleName = transform(people, Person::getName);
		System.out.println(peopleName);

	}

	public static <T, R> List<R> transform(List<T> originalList,
			Function<T, R> transformer) {
		List<R> transformedList = new ArrayList<R>();
		
		for (T originalValue : originalList) {
			transformedList.add(transformer.apply(originalValue));
		}
		
		return transformedList;
	}
}