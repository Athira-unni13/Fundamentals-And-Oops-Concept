//Question 19: Write a program to find the factorial value of any number
package assignment;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int factorial, number;
		System.out.print("To find factorial, enter a number: ");
		number = sc.nextInt();
		factorial = 1;
		sc.close();

		if (number < 0) {
			System.out.println("Invalid Input, Number should greater than 0");
		} else if (number == 0) {
			System.out.println("Factorial of 0 is " + 1);
		} else {
			for (int i = 1; i <= number; i++) {
				factorial = factorial * i;
			}
			System.out.println("Factorial of " + number + " is " + factorial);
		}
	}

}
