package org.punnoose.java8streams.commonclasses;

public class Person {

	private String name;
	private String sex;
	private int age;
	private String phone;
	private String state;
	
	public Person() {

	}

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Name: " + getName() + 
				"; Age: " + getAge() + 
				"; Sex: " + getSex() + 
				"; Phone: " + getPhone() +
				"; State: " + getState();
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}