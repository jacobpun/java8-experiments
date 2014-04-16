package org.punnoose.java8.lambda.service;

public class FakeTextingServiceImpl implements TextingService{

	@Override
	public void sendTextMessage(String phone) {
		// TODO Auto-generated method stub
		System.out.println("Sending text message to " + phone);
	}

}
