package org.punnoose.java8lambda.demo16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Chaining functions
 * @author "Punnoose Pullolickal"
 *
 */
public class LambdaExpressionsDemo16 {

	static Function<Double, Double> doubleIt = x -> x * 2;
	static Function<Double, Double> squareIt = x -> x * x;

	public static void main(String[] args) {
		List<Double> nums = Arrays.asList(new Double [] { 1.0, 2.0, 3.0, 4.0, 5.0 });
		
		//andThen example
		System.out.println(transform(nums, doubleIt.andThen(squareIt)));
		
		//compose example
		System.out.println(transform(nums, squareIt.compose(doubleIt)));
	}

	public static <T, R> List<R> transform(List<T> originalList,
			Function<T, R> transformer) {
		List<R> transformedList = new ArrayList<R>();

		for (T originalValue : originalList) {
			transformedList.add(transformer.apply(originalValue));
		}

		return transformedList;
	}
}