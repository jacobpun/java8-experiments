package org.punnoose.java8.lambda.service;

import java.util.ArrayList;
import java.util.List;

import org.punnoose.java8.lambda.vo.Person;

public class FakePersonServiceImpl implements PersonService {

	@Override
	public Person getPerson(int personId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> getPeople() {
		List<Person> people = new ArrayList<>();

		for (int i = 0; i < 100; i++) {
			Person p = createFakePerson(i);
			people.add(p);
		}
		return people;
	}


	private Person createFakePerson(int i) {
		Person p = new Person();
		p.setName(getFakeName(i));
		p.setAge(getFakeAge(i));
		p.setSex(getFakeGender(i));
		p.setPhone(getFakePhone(i));
		return p;
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
