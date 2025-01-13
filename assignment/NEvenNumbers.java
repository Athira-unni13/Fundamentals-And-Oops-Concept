//question 18:Write a program to find sum of all even numbers between 1 to n
package assignment;

import java.util.Scanner;

public class NEvenNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number, sum;
		sum = 0;
		System.out.print("Enter a number : ");
		number = sc.nextInt();
		sc.close();

		if (number < 0) {
			System.out.println("Invalid Input,The number should be positive number greater than 0");
		} else {

			for (int i = 1; i <= number; i++) {
				if (i % 2 == 0) {
					sum = sum + i;
				}
			}
			System.out.println("Sum of even numbers from 1 to " + number + " is: " + sum);
		}
	}

}
