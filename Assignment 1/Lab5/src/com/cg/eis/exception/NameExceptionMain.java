package com.cg.eis.exception;

import java.util.Scanner;

public class NameExceptionMain {

	public static void main(String[] args) throws NameException {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter firstname : ");
		String firstName = sc.next();

		System.out.println("enter last name : ");
		String lastName = sc.next();
		
		if (firstName.isBlank() || lastName.isBlank()) {
			throw new NameException(" invalid name type ");
			
		}
	}

}
 