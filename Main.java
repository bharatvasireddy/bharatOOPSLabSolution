package com.gl.itadmin.demo;

import java.util.Scanner;

import com.gl.itadmin.beans.Employee;
import com.gl.itadmin.services.EmployeeService;

public class Main {

	public static void main(String[] args) {
		int number;
		Employee name;

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the department from the following");
		System.out.println("1.Techniacl\n2.Admin\n3.Human Resource\n4.Legal");
		number = input.nextInt();

		switch (number) {
		case 1:
			name = new Employee("tech");
			break;
		case 2:
			name = new Employee("admin");
			break;
		case 3:
			name = new Employee("hr");
			break;
		case 4:
			name = new Employee("legal");
			break;
		}

		input.close();
		name = new Employee("bharat", "vasireddy");
		System.out.println(EmployeeService.showCredentials());
		System.out.println("Email -->" + EmployeeService.generateEmail());
		System.out.print("Password -->" + EmployeeService.generatePassword(6));

	}

}
