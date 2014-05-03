package org.punnoose.java8streams.demo04;

import java.util.Arrays;
import java.util.List;

import org.punnoose.java8streams.commonclasses.Person;
import org.punnoose.java8streams.commonclasses.TestDataFixture;

/**
 * Reduce Examples
 * 
 * @author "Punnoose Pullolickal"
 *
 */
public class StreamsDemo4 {

	public static void main(String[] args) {

		// String concatenation
		String[] strings = { "a", "b", "c", "d" };
		System.out.printf("Concatenated String: %s \r\n",
				Arrays.stream(strings).reduce("", (s1, s2) -> s1.concat(s2)));

		// Sum of integers
		int[] ints = { 1, 2, 3, 4, 5 };
		System.out.printf("Sum: %s \r\n",
				Arrays.stream(ints).reduce(0, (s1, s2) -> s1 + s2));

		// Oldest Person
		List<Person> people = new TestDataFixture().getFakePeople();
		System.out.printf(
				"Oldest Person: %s\r\n",
				people
					.stream()
					.reduce((p1, p2) -> p1.getAge() < p2.getAge() ? p2 : p1)
					.get()
				);
	}
}