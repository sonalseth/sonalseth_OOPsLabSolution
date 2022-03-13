package com.greatlearning.assignments.credentials.main;

import java.util.Scanner;

import com.greatlearning.assignments.credentials.util.CredentialService;

public class Driver {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your first name: ");
		String firstname = scanner.next();
		System.out.println("Enter your last name: ");
		String lastname = scanner.next();
		CredentialService Employee = new CredentialService(firstname, lastname);
		Employee.showCredentials();
		scanner.close();
	}
}
