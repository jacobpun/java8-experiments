package org.punnoose.java8streams.demo06;

import java.util.List;
import java.util.function.Predicate;

import org.punnoose.java8streams.commonclasses.Person;
import org.punnoose.java8streams.commonclasses.TestDataFixture;

/**
 * Limit & Skip Demo
 * @author "Punnoose Pullolickal"
 *
 */
public class StreamDemo6 {

	public static void main(String[] args) {

		List<Person> people = new TestDataFixture().getFakePeople();
		Predicate<? super Person> lessThan50Years = p -> {
			System.out.println("Calling Predicate for " + p);
			return p.getAge() < 50 ? true : false;
		};

		people.stream()
			  .filter(lessThan50Years)
			  .limit(10)
			  .skip(2)
			  .forEach(System.out::println);
	}
}