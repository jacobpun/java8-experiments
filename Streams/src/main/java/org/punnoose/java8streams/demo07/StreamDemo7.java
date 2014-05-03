package org.punnoose.java8streams.demo07;

import java.util.List;

import org.punnoose.java8streams.commonclasses.Person;
import org.punnoose.java8streams.commonclasses.TestDataFixture;

/**
 * Sort, min, max, distinct demo
 * @author "Punnoose Pullolickal"
 *
 */
public class StreamDemo7 {
	public static void main(String[] args) {
		List<Person> people = new TestDataFixture().getFakePeople();
		
		//Sort by age - ascending
		people.stream()
			  .sorted((p1,p2)->p1.getAge()-p2.getAge())
			  .forEach(System.out::println);
		
		//Find oldest person
		Person oldest = people
							.stream()
							.max((p1,p2)-> p1.getAge() -p2.getAge())
							.get();
		System.out.println("Oldest: " + oldest);
		
		//Find youngest person
		Person youngest = people
							.stream()
							.min((p1,p2)-> p1.getAge() -p2.getAge())
							.get();
		System.out.println("Youngest: " + youngest);

		//Distinct states
		people.stream()
				.map(Person::getState)
				.distinct()
				.forEach(System.out::println);;
		
	}
}