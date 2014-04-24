package org.punnoose.java8lambda.demo13;

import java.util.List;
import java.util.function.BinaryOperator;

import org.punnoose.java8lambda.commonclasses.Person;
import org.punnoose.java8lambda.commonclasses.TestDataFixture;

/**
 * java.util.function.BinaryOperator example
 * @author "Punnoose Pullolickal"
 *
 */
public class LambdaExpressionsDemo13 {

	public static void main(String[] args) {
		List<Person> people = new TestDataFixture().getFakePeople();
		Person eldest = collect(
									people,
									(p1, p2) -> p1.getAge() > p2.getAge() ? p1 : p2, 
									people.get(0)
								);
		System.out.println("Eldest: " + eldest);

		Person youngest = collect(
									people,
									(p1, p2) -> p1.getAge() < p2.getAge() ? p1 : p2, 
									people.get(0)
								);
		System.out.println("Youngest: " + youngest);

	}

	private static <T> T collect(List<T> listOfItems,
			BinaryOperator<T> operator, T starter) {
		for (T item : listOfItems) {
			starter = operator.apply(item, starter);
		}
		;
		return starter;
	}

}
