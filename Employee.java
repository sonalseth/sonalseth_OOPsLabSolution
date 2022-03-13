package com.greatlearning.assignments.credentials.model;

public class Employee {

	private String firstname;
	private String lastname;

	public String getFirstName() {
		return firstname;

	}

	public String getLastname() {
		return lastname;
	}

	public Employee(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
	}

}
