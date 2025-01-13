//Question 26:Write a Program to check Armstrong numbers or Not
package assignment;

import java.util.Scanner;
import java.lang.Math;

public class Amstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number, N, reminder, count, temp;
		System.out.println("Enter a number: ");
		number = sc.nextInt();
		int sum = 0;
		N = number;
		temp = number;
		count = 0;
		sc.close();
		if (number < 0) {
			System.out.println("Invalid Input, Input must be Positive number!");
		} else {

			while (number > 0) {
				count++;
				number = number / 10;
			}
			// System.out.println(count);

			while (temp > 0) {
				reminder = temp % 10;
				sum = (int) (sum + Math.pow(reminder, count));
				temp = temp / 10;
			}

			if (sum == N) {
				System.out.println(N + " is an Amstrong number");
			} else {
				System.out.println(N + " is not an Amstrong number");

			}
		}
	}

}
