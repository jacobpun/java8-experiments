package org.punnoose.java8lambda.demo4;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Method references example
 */
public class LambdaExpressionDemo4 {

	public static void main(String[] args) {
		List<Person> people = new TestDataFixture().getFakePeople();
		// Static Method Reference
		List<Person> males = filter(PersonPredicates::isMale, people);
		print(males);
	}

	private static void print(List<Person> people) {
		for (Person person : people) {
			System.out.println(person.getName() + "-" + person.getSex());
		}
	}

	public static List<Person> filter(Predicate<Person> predicate,
			List<Person> people) {
		
		return people.stream()
					.filter(predicate)
					.collect(Collectors.toList());
	
	}
}

class PersonPredicates {
	static boolean isMale(Person p) {
		return p.getSex().equals("M");
	}
}