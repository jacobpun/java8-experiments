package org.punnoose.java8streams.commonclasses;

import java.util.ArrayList;
import java.util.List;

public class TestDataFixture {
	
	String[] states ={"NY", "NJ","PA","IL","CA","TX","MA"};

	public List<Person> getFakePeople() {
		List<Person> people = new ArrayList<>();

		for (int i = 0; i < 100; i++) {
			Person p = createFakePerson(i);
			people.add(p);
		}
		return people;
	}

	public List<String> getFakePeopleNames() {
		List<String> peopleNames = new ArrayList<>();

		for (int i = 0; i < 100; i++) {
			peopleNames.add(getFakeName(i));
		}
		return peopleNames;
	}	

	private Person createFakePerson(int i) {
		Person p = new Person();
		p.setName(getFakeName(i));
		p.setAge(getFakeAge(i));
		p.setSex(getFakeGender(i));
		p.setPhone(getFakePhone(i));
		p.setState(getFakeState(i));
		return p;
	}

	private String getFakeState(int i) {
		return states[i%7];
	}

	private String getFakePhone(int i) {
		return "Phone-"+i;
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
