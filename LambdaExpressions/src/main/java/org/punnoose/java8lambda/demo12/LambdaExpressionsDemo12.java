package org.punnoose.java8lambda.demo12;

import java.util.function.Supplier;

import org.punnoose.java8lambda.commonclasses.Person;

/**
 * java.util.function.Supplier Demo
 * 
 * @author "Punnoose Pullolickal"
 *
 */
public class LambdaExpressionsDemo12 {

	public static void main(String[] args) {
		Supplier<Person> personSupplier1 = Person::new;
		Supplier<Person> personSupplier2 = () -> {
													Person p = new Person();
													p.setName("DefaultName");
													p.setPhone("000");
													p.setSex("F");
													p.setAge(0);
													return p;
												};
		
		
		System.out.println(personSupplier1.get());
		System.out.println(personSupplier2.get());
		
	}

}
