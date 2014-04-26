package org.punnoose.java8lambda.demo15;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.punnoose.java8lambda.commonclasses.Person;
import org.punnoose.java8lambda.commonclasses.TestDataFixture;

/**
 * Chaining Predicates
 * @author "Punnoose Pullolickal"
 *
 */

public class LambdaExpressionsDemo15 {

	private static Predicate<Person> isMale = p-> p.getSex().equals("M");
	private static Predicate<Person> isOlderThan60 = p-> p.getAge()>60;

	public static void main(String[] args) {
		List<Person> people = new TestDataFixture().getFakePeople();

		//Print males above 60
		System.out.println(filter(people, isMale.and(isOlderThan60)));
	
		//Print males OR person above 60
		System.out.println(filter(people, isMale.or(isOlderThan60)));

		//Print not males 
		System.out.println(filter(people, isMale.negate()));

	}

	public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
		ArrayList<T> targetList = new ArrayList<>();
		for (T item : list) {
			if (predicate.test(item)) {
				targetList.add(item);
			}
		}
		return targetList;
	}
}