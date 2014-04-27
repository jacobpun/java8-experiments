package org.punnoose.java8streams.demo3;

import java.util.List;

import org.punnoose.java8streams.commonclasses.Person;
import org.punnoose.java8streams.commonclasses.TestDataFixture;

/**
 * Filter & findFirst Demo
 * @author "Punnoose Pullolickal"
 *
 */
public class StreamsDemo3 {

	public static void main(String[] args) {
		
		List<Person> people = new TestDataFixture().getFakePeople();

		Person p1 = people
						.stream()
						.filter(e -> e.getAge() > 10)
						.findFirst()
						.orElse(new Person("Tom"));
		
		Person p2 = people
						.stream()
						.filter(e -> e.getAge() > 100)
						.findFirst()
						.orElse(new Person("Tom"));

		System.out.println(p1);
		System.out.println(p2);

	}
}