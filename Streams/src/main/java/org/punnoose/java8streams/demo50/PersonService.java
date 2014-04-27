package org.punnoose.java8streams.demo50;

import java.util.List;

import org.punnoose.java8streams.commonclasses.Person;

public interface PersonService {
	public Person getPerson(int personId);
	public List<Person> getPeople();
}
