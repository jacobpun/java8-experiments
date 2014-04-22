package org.punnoose.java8lambda.demo06;

import java.util.List;
import java.util.stream.Collectors;

import org.punnoose.java8lambda.commonclasses.Person;
import org.punnoose.java8lambda.commonclasses.TestDataFixture;

/**
 * Instance Method Reference Example
 * 
 */
public class LambdaExpressionDemo6 {
	
	public static void main(String[] args) {
		List<String> peopleNames;
		List<Person> people = new TestDataFixture().getFakePeople();
		
		//Lambda Style
		System.out.println("Using Lambda");
		peopleNames = people
						.stream()
						.map(person -> person.getName())
						.collect(Collectors.toList());
		print(peopleNames);
		
		//Instance method reference style
		System.out.println("Using Method Reference");
		peopleNames = people
						.stream()
						.map(Person::getName)
						.collect(Collectors.toList());
		print(peopleNames);
	}
	
	
	private static void print(List<String> peopleNames) {
		for (String personName : peopleNames) {
			System.out.printf("%s\r\n", personName);
		}
	}	
}