package org.punnoose.java8streams.demo02;

import java.util.Arrays;
import java.util.List;

import org.punnoose.java8streams.commonclasses.Person;

/**
 * Map Demo
 * @author "Punnoose Pullolickal"
 *
 */
public class StreamsDemo2 {
	
	public static void main(String[] args) {

		List<String> peopleNames = Arrays.asList(new String []{"Mike", "John"});
		peopleNames.stream().map(Person::new).forEach(System.out::println);;
	
	}

}
