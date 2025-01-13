//Question 3 : Write a program to check whether a number is even or odd

package assignment;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number;
		System.out.print("Enter a number: ");
		number = scan.nextInt();
		scan.close();

		// checking the given number is odd or even

		if (number % 2 == 0) {
			System.out.println(number + " is an Even number");
		} else {
			System.out.println(number + " is an Odd number");
		}

	}

}
