//Question 27: Write a Program to Check Given Number is a Palindrome or Not
package assignment;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int number, N, sum, reminder;
		System.out.print("Enter a number: ");
		number = sc.nextInt();
		N = number;
		sum = 0;
		sc.close();
		
		if (number < 0) {
			System.out.println("Invalid Input, Input must be Positive number!");
		} else {
			
			while (number > 0) {
				reminder = number % 10;
				sum = sum * 10 + reminder;
				number = number / 10;
			}
			
			if (sum == N) {
				System.out.println(N + " is a Palindrom ");
			} else {
				System.out.println(N + " is not a Palindrom ");

			}
		}
	}

}
