package org.punnoose.java8streams.demo09;

import java.util.function.Supplier;

public class FibonacciGenerator implements Supplier<Long> {
	private long previous = 0;
	private long current = 1;

	@Override
	public Long get() {
		long next = previous + current;
		previous = current;
		current = next;
		return current;
	}
}
