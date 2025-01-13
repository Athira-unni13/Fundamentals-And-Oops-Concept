//Question 2:Write a program to check whether a number is divisible by 5

package assignment;

import java.util.Scanner;

public class Divisible {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number;

		System.out.print("Enter a number: ");
		number = scan.nextInt();
		
		scan.close();

		// check the number divisible by 5

		if (number % 5 == 0) {
			System.out.println(number + " is divisible by 5");
		} else {
			System.out.println(number + " is not divisible by 5");
		}
	}

}
