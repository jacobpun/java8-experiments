package org.punnoose.java8streams.partitioningandgroupby;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.punnoose.java8streams.commonclasses.Person;

public class GroupingBy {

	public static void main(String[] args) {
		Person p1 = new Person("Alex");
		p1.setAge(20);;
		Person p2 = new Person("Joe");
		p2.setAge(25);
		Person p3 = new Person("Nancy");
		p3.setAge(12);
		Person p4 = new Person("Daniel");
		p4.setAge(12);
		
		Stream<Person> s1 = Stream.of(p1,p2,p3, p4);
		Map<Integer, List<Person>> groupedByAge = s1.collect(Collectors.groupingBy(person -> person.getAge()));
		System.out.println(groupedByAge);	
	}
}