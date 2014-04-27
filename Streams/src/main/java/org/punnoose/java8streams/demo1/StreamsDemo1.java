package org.punnoose.java8streams.demo1;

import java.util.stream.Stream;

import org.punnoose.java8streams.commonclasses.Person;

/**
 * forEach demo
 * 
 * @author "Punnoose Pullolickal"
 *
 */
public class StreamsDemo1 {

	public static void main(String[] args) {
		Person person1 = new Person("John");
		Person person2 = new Person("Mike");

		// Sequential stream
		Stream.of(person1, person2).forEach(p -> p.setAge(p.getAge() + 1));

		// Parallel stream
		Stream.of(person1, person2).parallel().forEach(System.out::println);

	}
}