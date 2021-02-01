package com.cg.eis.exception;

import java.util.Scanner;

public class EmployeeExceptionMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your salary :");
		double salary = sc.nextDouble();
		
		try {
			if (salary <3000) {
				throw new EmployeeException ("invalid salary");
			}
			else {
				System.out.println("valid salary");
			}
			
		}
		catch (EmployeeException e) {
			System.out.println(e.getMessage());
		}
	}

}
