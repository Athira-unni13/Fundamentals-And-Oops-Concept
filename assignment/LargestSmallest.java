/*Question 23:Write a program to enter the numbers till the user wants and at the end 
	the program should display the largest and smallest numbers entered*/

package assignment;

import java.util.Scanner;

public class LargestSmallest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, largest, smallest;

		System.out.print("How many numbers you want to enter: ");
		n = sc.nextInt();
		int[] numbers = new int[n];

		System.out.println("Please enters the numbers");
		for (int i = 0; i < n; i++) {
			numbers[i] = sc.nextInt();
		}
		sc.close();

		largest = numbers[0];
		smallest = numbers[0];
		for (int i = 1; i < n; i++) {
			if (largest < numbers[i]) {
				largest = numbers[i];
			}
			if (smallest > numbers[i]) {
				smallest = numbers[i];
			}
		}
		System.out.println("The Largest Number that you Entered is : " + largest);
		System.out.println("The Smallest Number that you Entered is : " + smallest);

	}

}
