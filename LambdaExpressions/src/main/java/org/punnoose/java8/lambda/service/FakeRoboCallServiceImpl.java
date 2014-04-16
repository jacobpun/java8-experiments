package org.punnoose.java8.lambda.service;

public class FakeRoboCallServiceImpl implements RoboCallService {

	@Override
	public void callPhone(String number) {
		System.out.println("Calling: " + number);
	}

}
