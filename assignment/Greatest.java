//Question 1 : Write a Java program that takes three numbers from the user and prints the greatest number.

package assignment;

import java.util.Scanner;

public class Greatest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A, B, C;

		System.out.print("Enter first number: ");
		A = sc.nextInt();
		System.out.print("Enter second number: ");
		B = sc.nextInt();
		System.out.print("Enter third number: ");
		C = sc.nextInt();
		sc.close();

		// Compare 3 numbers

		if (A > B && A > C) {
			System.out.println(A + " is the greatest number among three numbers");
		} else if (B > A && B > C) {
			System.out.println(B + " is the greatest number among three numbers");
		} else {
			System.out.println(C + " is the greatest number among three numbers");
		}
	}

}
