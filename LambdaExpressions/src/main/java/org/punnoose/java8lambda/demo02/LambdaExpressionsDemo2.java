package org.punnoose.java8lambda.demo02;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Array Sorting example using Lambdas
 */
public class LambdaExpressionsDemo2 {

	//Pre-Lambda - Sort using anonymous inner classes (Java 7 & before)
	public String[] sortStringArrayByLengthPreLambda(String[] strings) {
		
		Arrays.sort(
			strings,
			new Comparator<String>() {
				@Override
				public int compare(String s1, String s2) {
					return s1.length() - s2.length();
				}
			}
		);
		
		return strings;
	}


	//Lambda - Longer form (not making use of Type inferencing & Implied Return Types)
	public String[] sortStringArrayByLength(String[] strings) {
		
		Arrays.sort(
			strings, 
			(String s1, String s2) -> {return (s1.length() - s2.length());}
		);
		
		return strings;
		
	}


	//Lambda - Type inferencing & Implied Return Type example
	public String[] sortStringArrayByFirstChar(String[] strings) {
		
		Arrays.sort(
			strings, 
			(s1, s2) -> (s1.charAt(0) - s2.charAt(0)) // Type of s1 & s2 not specified; 
													  // 'return' also not specified.
		);
		
		return strings;
	}
}