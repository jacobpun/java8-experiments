package org.punnoose.java8lambda.demo04;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.punnoose.java8lambda.commonclasses.Person;
import org.punnoose.java8lambda.commonclasses.TestDataFixture;

/**
 * Static Method references example
 */
public class LambdaExpressionDemo4 {

	public static void main(String[] args) {
		List<Person> people = new TestDataFixture().getFakePeople();
		
		//Lambda Style
		System.out.println("Using Lambda");
		List<Person> males = filter(p-> PersonPredicates.isMale(p), people);
		print(males);
		
		// Static Method Reference Style
		System.out.println("Using Method Reference");
		males = filter(PersonPredicates::isMale, people);
		print(males);
	}

	private static void print(List<Person> people) {
		for (Person person : people) {
			System.out.printf("%s  - %s\r\n", person.getName(), person.getSex());
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