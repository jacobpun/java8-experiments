package org.punnoose.java8streams.demo09;

import java.util.stream.Stream;

/**
 * Infinite stream demo - base on Generator
 * @author "Punnoose Pullolickal"
 *
 */
public class StreamDemo9 {
	public static void main(String[] args) {
		
		System.out.println("Five Fibonacci numbers");
		Stream.generate(new FibonacciGenerator()).limit(5)
				.forEach(System.out::println);
		
		System.out.println("\r\nTen Fibonacci numbers");
		Stream.generate(new FibonacciGenerator()).limit(10)
				.forEach(System.out::println);
	}
}