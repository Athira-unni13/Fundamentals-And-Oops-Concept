//Question 8:Write a program to check whether a character is uppercase or lowercase alphabet
package assignment;

import java.util.Scanner;

public class UpperLower {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch;
		System.out.println("Enter an Alphabet: ");
		ch = sc.next().charAt(0);
		sc.close();
		if (ch >= 'a' && ch <= 'z') {
			System.out.println(ch + " is a Lowercase");
			}
		else if (ch >= 'A' && ch <= 'Z') {
			System.out.println(ch + " is a Uppercase");
		}else {
			System.out.println(ch + " is not an Alphabet");

		}

	}

}
