package com.exe;

import java.util.Scanner;

@SuppressWarnings("serial")
public class CustomExcep extends Exception {
	private static String msg;

	public CustomExcep(String msg) {
		
		CustomExcep.msg = msg;
	}

	public static void printMsg() {
		System.err.println(msg);
	}

	public static void main(String[] args) {
		System.out.println("Enter the age to check eligible for juniours cricket club");
		Scanner scanner = new Scanner(System.in);

		try {
			int age = scanner.nextInt();
			if (age > 19)
				throw new CustomExcep("Age must be below 19");
			System.out.println("Your are eligible for the club.");
		} catch (CustomExcep e) {
			printMsg();
		} finally {
			scanner.close();
		}
	}

}