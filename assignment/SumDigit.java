//Question 21: write a program to sum of its Digits
package assignment;

import java.util.Scanner;

public class SumDigit {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int number, sum, reminder;
		System.out.print("Enter a number: ");
		number = sc.nextInt();
		sum = 0;
		sc.close();

		if (number < 0) {
			System.out.println("Invalid Input, Input must be positive number!");
		} else {
			while (number > 0) {
				reminder = number % 10;
				sum = sum + reminder;
				number = number / 10;
			}
			System.out.println("Sum of digit in the number is: " + sum);
		}
	}

}
