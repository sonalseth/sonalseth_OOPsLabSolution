package com.greatlearning.assignments.credentials.util;

import java.util.Scanner;

public class CredentialService {
	private String firstname;
	private String lastname;
	private String password;
	private String department;
	private String comName = "abc.com";

//call the method for the department setup
	public CredentialService(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.department = setDepartment();
		System.out.println("Department: " + this.department);

//call a method that returns a random password
		this.password = setPassword(8);

	}

// Check for department

	@SuppressWarnings("resource")
	private String setDepartment() {
		System.out.print(
				"Department codes:\n1) Technical \n2) Admin \n3) Human Resource \n4) Legal \n0) None\nEnter department code ");
		Scanner scanner = new Scanner(System.in);
		int department = scanner.nextInt();

		switch (department) {
		case 0:
			department = 0;
			return "null";
		case 1:
			department = 1;
			return "tech";
		case 2:
			department = 2;
			return "adm";
		case 3:
			department = 3;
			return "Hr";
		case 4:
			department = 4;
			return "Ig";
		default:
			System.out.println("Invalid choice. Enter a valid no.\n");
		}
		scanner.close();

		return "";

	}

// generate a random password
	private String setPassword(int length) {
		String passwordChar = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^*()_+/;";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int random = (int) (Math.random() * passwordChar.length());
			password[i] = passwordChar.charAt(random);
		}
		return new String(password);
	}

	public void showCredentials() {
		System.out.println("Name: " + this.firstname + " " + this.lastname);
		System.out.println("Dear " + this.firstname + " " + "your generated credentials are as follows");
		System.out.println("Email ------> " + this.firstname.toLowerCase() + "." + this.lastname.toLowerCase() + "@"
				+ this.department.toLowerCase() + "." + comName);
		System.out.println("Password -----> " + this.password);
	}

}
