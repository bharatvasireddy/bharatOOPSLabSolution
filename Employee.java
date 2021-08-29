package com.gl.itadmin.beans;

public class Employee {

	public static String firstName;
	public static String lastName;
	public static String department;
	public static String company = "abc";

	public Employee(String c) {
		department = c;

	}

	public Employee(String a, String b) {
		firstName = a;
		lastName = b;
	}
}
