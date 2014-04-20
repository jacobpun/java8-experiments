package org.punnoose.java8lambda.demo02;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.punnoose.java8lambda.demo02.LambdaExpressionsDemo2;

public class LambdaExpressionsDemo2Test {

	@Test
	public void should_sort_array_by_length() {
		String[] strings ={"bb","c","aaa"};
		LambdaExpressionsDemo2 demo2 = new LambdaExpressionsDemo2();
		strings = demo2.sortStringArrayByLength(strings);
		assertThat(strings, is(new String[] {"c","bb","aaa"}));
	}

	@Test
	public void should_sort_array_by_first_char() {
		String[] strings ={"bb","c","aaa"};
		LambdaExpressionsDemo2 demo2 = new LambdaExpressionsDemo2();
		strings = demo2.sortStringArrayByFirstChar(strings);
		assertThat(strings, is(new String[] {"aaa","bb","c"}));
	}
}