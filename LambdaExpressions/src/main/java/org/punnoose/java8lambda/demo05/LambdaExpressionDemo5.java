package org.punnoose.java8lambda.demo05;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Constructor Method Reference Example
 * 
 */
public class LambdaExpressionDemo5 {
	
	public static void main(String[] args) {
		List<String> peopleNames = new TestDataFixture().getFakePeopleNames();
		List<Person> people;
		
		//Lambda Style
		System.out.println("Using Lambda");
		people = peopleNames
						.stream()
						.map(name -> new Person(name))
						.collect(Collectors.toList());
		print(people);
		
		//Constructor method reference style
		System.out.println("Using Method Reference");
		people = peopleNames
						.stream()
						.map(Person::new)
						.collect(Collectors.toList());
		print(people);
	}
	
	
	private static void print(List<Person> people) {
		for (Person person : people) {
			System.out.printf("%s\r\n", person.getName());
		}
	}	
}