//Question 6 : Write a program to input any alphabet and check whether it is vowel or consonant

package assignment;

import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char alpha;
		System.out.print("Enter an Alphabet: ");
		alpha = scan.next().charAt(0);
		scan.close();

		// checking vowel or consonant
		switch (alpha) {
		case 'a':
			System.out.println(alpha + " is a vowel");
			break;
		case 'e':
			System.out.println(alpha + " is a vowel");
			break;
		case 'i':
			System.out.println(alpha + " is a vowel");
			break;
		case 'o':
			System.out.println(alpha + " is a vowel");
			break;
		case 'u':
			System.out.println(alpha + " is a vowel");
			break;
		case 'A':
			System.out.println(alpha + " is a vowel");
			break;
		case 'E':
			System.out.println(alpha + " is a vowel");
			break;
		case 'I':
			System.out.println(alpha + " is a vowel");
			break;
		case 'O':
			System.out.println(alpha + " is a vowel");
			break;
		case 'U':
			System.out.println(alpha + " is a vowel");
			break;
		default:
			System.out.println(alpha + " is a consonant");

		}

	}

}
