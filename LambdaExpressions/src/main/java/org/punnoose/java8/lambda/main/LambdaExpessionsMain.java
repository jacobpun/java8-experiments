package org.punnoose.java8.lambda.main;

import java.util.List;

import org.punnoose.java8.lambda.service.FakePersonServiceImpl;
import org.punnoose.java8.lambda.service.FakeRoboCallServiceImpl;
import org.punnoose.java8.lambda.service.FakeTextingServiceImpl;
import org.punnoose.java8.lambda.service.PersonService;
import org.punnoose.java8.lambda.service.RoboCallService;
import org.punnoose.java8.lambda.service.TextingService;
import org.punnoose.java8.lambda.vo.Person;

public class LambdaExpessionsMain {

	private RoboCallService roboCallService = new FakeRoboCallServiceImpl();
	private TextingService textingService = new FakeTextingServiceImpl();
	private PersonService personService = new FakePersonServiceImpl();

	public static void main(String[] args) {

		LambdaExpessionsMain main = new LambdaExpessionsMain();

		// Initialize few fake people for testing
		List<Person> people = main.initializeFakePeople();

		main.callEligibleMales(people);
		main.textEligibleMales(people);

	}

	private void callEligibleMales(List<Person> people) {

		// Call Males above 16 years & less than 50 years of age
		System.out.println("\n\nCALL MALES 16 - 50 YEARS AGE");
		people
			.stream()
			.filter(p -> p.getAge() >= 16 && p.getAge() < 50 && p.getSex().equals("M"))
			.map(p -> p.getPhone())
			.forEach(num -> roboCallService.callPhone(num));

	}

	private void textEligibleMales(List<Person> people) {

		// Text Males above 16 years & less than 50 years of age
		System.out.println("\n\nTEXT MALES 16 - 50 YEARS AGE");

		people
			.stream()
			.filter(p -> p.getAge() >= 16 && p.getAge() < 50 && p.getSex().equals("M"))
			.map(p -> p.getPhone())
			.forEach(num -> textingService.sendTextMessage(num));

	}

	private List<Person> initializeFakePeople() {
		return personService.getPeople();
	}
}