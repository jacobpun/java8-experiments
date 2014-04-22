package org.punnoose.java8lambda.demo10;

import static org.mockito.BDDMockito.given;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.punnoose.java8lambda.commonclasses.TestDataFixture;

@RunWith(MockitoJUnitRunner.class)
public class LambdaExpessionsDemo10Test {

	@Mock
	private RoboCallService roboCallService;
	@Mock
	private TextingService textingService;
	@Mock
	private PersonService personService;

	@InjectMocks
	LambdaExpessionsDemo10 main = new LambdaExpessionsDemo10();

	@Before
	public void initialize() {
		TestDataFixture testData = new TestDataFixture();
		given(personService.getPeople()).willReturn(testData.getFakePeople());

	}

	@Test
	public void should_call_eligible_males() {
		int COUNT_ELIGIBLE_MALES = 3;
		main.callEligibleMales(personService.getPeople());
		verify(roboCallService, 
				times(COUNT_ELIGIBLE_MALES)).callPhone(anyString());
	}

	@Test
	public void should_send_text_messages_to_eligible_males() {
		int COUNT_ELIGIBLE_MALES = 3;
		main.textEligibleMales(personService.getPeople());
		verify(textingService, 
				times(COUNT_ELIGIBLE_MALES)).sendTextMessage(anyString());
	}
}