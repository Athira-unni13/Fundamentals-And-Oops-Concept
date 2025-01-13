//Question 9:Write a program to input week number and print week day

package assignment;

import java.util.Scanner;

public class WeekDay {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int weekNumber;

		System.out.print("Enter a week number: ");
		weekNumber = sc.nextInt();
		sc.close();
		switch (weekNumber) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Invalid week number!");
		}
	}

}
