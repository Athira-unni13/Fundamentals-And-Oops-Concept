//Question 5 : Write a program to check whether a character is alphabet or not

package assignment;

import java.util.Scanner;


public class AlphabetOrNot {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char value;
		System.out.println("Enter a charachter: ");
		value = scan.next().charAt(0);
		scan.close();

		// check alphabet or not

		if ((value >= 'a' && value <= 'z') || (value >= 'A' && value <= 'Z')) {
			System.out.println(value + " is a Alphabet");
		} else {
			System.out.println(value + " is not a Alphabet");

		}
	}

}
