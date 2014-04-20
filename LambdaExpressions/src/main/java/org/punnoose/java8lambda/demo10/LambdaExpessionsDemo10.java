package org.punnoose.java8lambda.demo10;

import java.util.List;

public class LambdaExpessionsDemo10 {

	private RoboCallService roboCallService;
	private TextingService textingService;

	public void callEligibleMales(List<Person> people) {

		// Call Males above 16 years & less than 21 years of age
		people.parallelStream().filter(p -> p.getAge() < 21)
				.filter(p -> p.getAge() >= 16)
				.filter(p -> p.getSex().equals("M"))
				.map(p -> p.getPhone())
				.forEach(num -> getRoboCallService().callPhone(num));

	}

	public void textEligibleMales(List<Person> people) {

		// Text Males above 16 years & less than 21 years of age
		people.parallelStream().filter(p -> p.getAge() < 21)
				.filter(p -> p.getAge() >= 16)
				.filter(p -> p.getSex().equals("M"))
				.map(p -> p.getPhone())
				.forEach(num -> getTextingService().sendTextMessage(num));

	}

	public RoboCallService getRoboCallService() {
		return roboCallService;
	}

	public void setRoboCallService(RoboCallService roboCallService) {
		this.roboCallService = roboCallService;
	}

	public TextingService getTextingService() {
		return textingService;
	}

	public void setTextingService(TextingService textingService) {
		this.textingService = textingService;
	}

}