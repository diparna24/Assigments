package com.cg.eis.exception;

import java.util.Scanner;

public class AgeExceptionMain {

	public static void main(String[] args) throws AgeException {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter an age: ");
		int age = sc.nextInt();
		if (age < 15) {
			throw new AgeException("age shouldnot be below 15");
		} else {
			System.out.println("valid age ");
		}

	}
}
