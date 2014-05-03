package org.punnoose.java8streams.demo05;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.partitioningBy;
import static java.util.stream.Collectors.toCollection;
import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.punnoose.java8streams.commonclasses.Person;
import org.punnoose.java8streams.commonclasses.TestDataFixture;

/**
 * Collectors Demo
 * @author "Punnoose Pullolickal"
 *
 */
public class StreamsDemo5 {

	public static void main(String[] args) {

		List<Person> people = new TestDataFixture().getFakePeople();
	
		// collect stream to a List
		List<Person> p1 = people
								.stream()
								.filter(e -> e.getState().equals("NJ"))
								.collect(toList());
		System.out.printf("Collect stream to a List: %s\r\n", p1);
		
		
		// Collect stream to an array
		Object[] p2 = people
								.stream()
								.filter(e -> e.getState().equals("NJ"))
								.toArray();
		System.out.printf("Collect stream to an array: %s \r\n", p2.length);

		
		// Collect stream to an Arraylist
		List<Person> p3 = people
								.stream()
								.filter(e -> e.getState().equals("NJ"))
								.collect(toCollection(ArrayList::new));
		System.out.printf("Collect stream to an Arraylist: %s \r\n", p3);

		
		//partitioningBy demo 
		Map<Boolean, List<Person>> males = people
								.stream()
								.collect(partitioningBy(p -> p.getSex().equals("M")));		
		System.out.printf("Males: %s\r\n", males.get(true));
		System.out.printf("Females: %s\r\n", males.get(false));

		
		//groupingBy demo 
		Map<String, List<Person>> peopleByState = people
								.stream()
								.collect(groupingBy(Person::getState));		
		System.out.printf("NJ Residents: %s\r\n", peopleByState.get("NJ"));
		System.out.printf("NY Residents: %s\r\n", peopleByState.get("NY"));
		
		
	}
}