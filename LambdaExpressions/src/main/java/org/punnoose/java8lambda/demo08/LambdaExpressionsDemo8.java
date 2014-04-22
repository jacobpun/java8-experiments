package org.punnoose.java8lambda.demo08;

import java.util.List;
import java.util.function.Predicate;

import org.punnoose.java8lambda.commonclasses.Person;
import org.punnoose.java8lambda.commonclasses.TestDataFixture;

/**
 * Predicate Example
 * 
 * @author "Punnoose Pullolickal"
 *
 */
public class LambdaExpressionsDemo8 {

	public static void main(String[] args) {
		List<Person> people = new TestDataFixture().getFakePeople();

		// First person having age greater than 15
		System.out.println(
				findFirstMatch(
					people, 
					p -> p.getAge() > 15
				)
		);

		// First Female having age greater than 15
		System.out.println(
				findFirstMatch(
					people, 
					p -> p.getAge() > 15 && p.getSex().equals("F")
				)
		);
		
	}

	private static <T> T findFirstMatch(List<T> candidates, Predicate<T> matcher) {
		for (T possibleMatch : candidates) {
			if (matcher.test(possibleMatch)) {
				return possibleMatch;
			}
		}
		return null;
	}
}