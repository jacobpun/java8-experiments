package org.punnoose.java8lambda.demo2;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaExpressionsDemo2 {

	//Pre-Lambda
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


	//Lambda - Longer form
	public String[] sortStringArrayByLength(String[] strings) {
		
		Arrays.sort(
			strings, 
			(String s1, String s2) -> {return (s1.length() - s2.length());}
		);
		
		return strings;
	}


	//Lambda - Type inferencing & Implied Return example
	public String[] sortStringArrayByFirstChar(String[] strings) {
		
		Arrays.sort(
			strings, 
			(s1, s2) -> (s1.charAt(0) - s2.charAt(0))
		);
		
		return strings;
	}
}