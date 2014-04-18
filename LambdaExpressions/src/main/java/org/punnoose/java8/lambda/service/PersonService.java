package org.punnoose.java8.lambda.service;

import java.util.List;

import org.punnoose.java8.lambda.domain.Person;

public interface PersonService {
	public Person getPerson(int personId);
	public List<Person> getPeople();
}
