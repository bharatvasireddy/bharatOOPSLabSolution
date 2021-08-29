package com.gl.itadmin.services;

import com.gl.itadmin.beans.Employee;
import java.util.Random;

public class EmployeeService {

	public static char[] generatePassword(int length) {
		String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
		String specialCharacters = "!@#$";
		String numbers = "1234567890";
		String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
		Random random = new Random();
		char[] password = new char[length];
		password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
		password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
		password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
		password[3] = numbers.charAt(random.nextInt(numbers.length()));
		for (int i = 4; i < length; i++) {
			password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
		}
		return password;

	}

	public static String showCredentials() {
		String credentials = "Dear " + Employee.firstName + " your generated creadentials are as follows";

		return credentials;

	}

	public static String generateEmail() {

		String email = Employee.firstName + Employee.lastName + "@" + Employee.department + "." + Employee.company
				+ ".com";

		return email;
	}

}
