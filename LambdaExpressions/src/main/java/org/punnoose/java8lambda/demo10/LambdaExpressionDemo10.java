package org.punnoose.java8lambda.demo10;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import org.punnoose.java8lambda.commonclasses.Person;
import org.punnoose.java8lambda.commonclasses.TestDataFixture;

/**
 * BiFunction example
 * 
 * @author "Punnoose Pullolickal"
 *
 */
public class LambdaExpressionDemo10 {

	public static void main(String[] args) {

		List<Person> people = new TestDataFixture().getFakePeople();

		//Method Reference Style
		doTest(people, "Name-10", PersonUtil::FindPersonByName);
		doTest(people, 10, PersonUtil::FindPersonByAge);
	
		//Lambda Style
		doTest(people, 10,
				(persons, age) -> firstMatch(persons, p -> p.getAge() == age));
	}

	public static <T, U> void doTest(List<T> candidates, U arg,
			BiFunction<List<T>, U, T> function) {

		T result = function.apply(candidates, arg);
		System.out.println(result);

	}

	public static <T> T firstMatch(List<T> candidates, Predicate<T> predicate) {
		for (T candidate : candidates) {
			if (predicate.test(candidate)) {
				return candidate;
			}
		}
		return null;
	}

}

class PersonUtil {

	static Person FindPersonByName(List<Person> people, String name) {
		for (Person person : people) {
			if (person.getName().equals(name)) {
				return person;
			}
		}
		return null;
	}

	static Person FindPersonByAge(List<Person> people, int age) {
		for (Person person : people) {
			if (person.getAge() == age) {
				return person;
			}
		}
		return null;
	}
}