//Question 7 : Write a program to input any character and check whether it is alphabet, digit or special character.

package assignment;

import java.util.Scanner;

public class AlphaNumSpec {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch;
		System.out.println("Enter a charachter: ");
		ch = sc.next().charAt(0);
		sc.close();
		if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
			System.out.println(ch + " is a alphabet");
		} else if (ch >= '0' && ch <= '9') {
			System.out.println(ch + " is a digit");
		} else {
			System.out.println(ch + " is a Special charachter");
		}
	}

}
