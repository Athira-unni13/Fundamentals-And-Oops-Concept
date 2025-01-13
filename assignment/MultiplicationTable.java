/*Question 16: Write a program to print tables
 * prompts the user to input three integers: a starting number, an ending number, and a tables number. 
 * print the multiplication table of the specified number from the starting number to the ending number, inclusive.
*/

package assignment;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int startNumber, endNumber, number;
		System.out.print("Enter the number: ");
		number = sc.nextInt();
		System.out.print("Enter the starting position: ");
		startNumber = sc.nextInt();
		System.out.print("Enter the ending position: ");
		endNumber = sc.nextInt();
		sc.close();

		System.out.println("Multiplication table of " + number + " from " + startNumber + " to " + endNumber + " is: ");

		for (int i = startNumber; i <= endNumber; i++) {
			System.out.println(i + " * " + number + " = " + i * number);
		}

	}

}
