package org.punnoose.java8lambda.demo50;

import java.util.List;

import org.punnoose.java8lambda.commonclasses.Person;

public interface PersonService {
	public Person getPerson(int personId);
	public List<Person> getPeople();
}
