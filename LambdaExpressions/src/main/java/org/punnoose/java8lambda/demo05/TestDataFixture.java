package org.punnoose.java8lambda.demo05;

import java.util.ArrayList;
import java.util.List;

public class TestDataFixture {


	public List<String> getFakePeopleNames() {
		List<String> peopleNames = new ArrayList<>();

		for (int i = 0; i < 100; i++) {
			peopleNames.add(getFakeName(i));
		}
		return peopleNames;
	}


	private String getFakeName(int i) {
		return "Name-" + i;
	}
	
}
