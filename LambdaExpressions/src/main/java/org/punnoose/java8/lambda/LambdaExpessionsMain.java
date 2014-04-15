package org.punnoose.java8.lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpessionsMain {

	private List<Person> persons = new ArrayList<>();

	public static void main(String[] args) {
		LambdaExpessionsMain main = new LambdaExpessionsMain();
		main.initializeFakePeople();

		// Call persons above 16 years of age
		System.out.println("CALL PERSONS ABOVE 16 YEARS AGE");
		main.roboCallMatchingPersons(p -> p.getAge() >= 16);

		// Call Males above 16 years of age
		System.out.println("\n\nCALL MALES ABOVE 16 YEARS AGE");
		main.roboCallMatchingPersons(p -> p.getAge() >= 16
				&& p.getSex().equals("M"));

		// Call Males above 16 years & less than 50 years of age
		System.out
				.println("\n\nCALL MALES ABOVE 16 YEARS & LESS THAN 50 YEARS AGE");
		main.roboCallMatchingPersons(p -> p.getAge() >= 16 && p.getAge() < 50
				&& p.getSex().equals("M"));

	}

	private void roboCallMatchingPersons(Predicate<Person> p) {
		for (Person person : persons) {
			if (p.eval(person)) {
				System.out.println("Making robo all to person: "
						+ person.getName() + " (" + person.getSex() + ")");
			}
		}
	}

	private void initializeFakePeople() {
		for (int i = 0; i < 100; i++) {
			Person p = createFakePerson(i);
			persons.add(p);
		}
	}

	private Person createFakePerson(int i) {
		Person p = new Person();
		p.setName(getFakeName(i));
		p.setAge(getFakeAge(i));
		p.setSex(getFakeGender(i));
		return p;
	}

	private int getFakeAge(int i) {
		return i;
	}

	private String getFakeName(int i) {
		return "Name-" + i;
	}
	
	private String getFakeGender(int i){
		return i%2 == 0? "M":"F";
	}	
}