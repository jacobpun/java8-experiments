package org.punnoose.java8streams.demo08;

import java.util.List;
import java.util.function.Predicate;

import org.punnoose.java8streams.commonclasses.Person;
import org.punnoose.java8streams.commonclasses.TestDataFixture;

/**
 * allMatch, anyMatch & count demo
 * 
 * @author "Punnoose Pullolickal"
 *
 */
public class StreamDemo8 {
	public static void main(String[] args) {
		List<Person> people = new TestDataFixture().getFakePeople();

		Predicate<Person> livesInNY = p -> p.getState().equals("NY");

		// Everybody lives in NY?
		boolean everybodyLivesInNY = people.stream().allMatch(livesInNY);
		System.out
				.printf("Everybody lives in NY?:  %s\r\n", everybodyLivesInNY);

		// At least one lives in NY?
		boolean atleastOneLivesInNY = people.stream().anyMatch(livesInNY);
		System.out.printf("At least one lives in NY?:  %s\r\n",
				atleastOneLivesInNY);

		// How many lives in NY?
		long howManyLivesInNY = people.stream().filter(livesInNY).count();
		System.out.printf("How many lives in NY?:  %s\r\n", howManyLivesInNY);

	}
}