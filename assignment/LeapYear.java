//Question 4:Write a program to check whether a year is leap year or not
package assignment;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int year;
		System.out.println("Enter a year: ");
		year = scan.nextInt();
		scan.close();

		// check Leap year or not2

		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println(year + " is a Leap Year");
		} else {
			System.out.println(year + " is not a Leap Year");
		}
	}

}
