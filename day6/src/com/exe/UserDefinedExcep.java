package com.exe;

import java.util.Scanner;

public class UserDefinedExcep {
	public static void isValid(int age) throws CustomExcep {
		if (age > 19)
			throw new CustomExcep("Age must be below 19");
	}
	public static void main(String[] args) {
		System.out.println("Enter the age to check eligible for juniours cricket club");
		Scanner scanner = new Scanner(System.in);

		try {
			int age = scanner.nextInt();
			isValid(age);
			System.out.println("Your are eligible for the club.");
		} catch (CustomExcep e) {
			CustomExcep.printMsg();
		} finally {
			scanner.close();
		}
	}

}
