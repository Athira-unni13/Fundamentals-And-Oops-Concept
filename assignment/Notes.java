//Question 11: Write a program to count total number of notes in given amount

package assignment;

import java.util.Scanner;

public class Notes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int amount, sumAmount, totalNotes = 0;
		System.out.print("Enter the amount: ");
		amount = sc.nextInt();
		int i = 0;
		sc.close();
		sumAmount = amount;
		int[] arrayNotes = { 500, 100, 50, 20, 10, 5, 1 };
		while (amount > 0) {
			sumAmount = amount;
			sumAmount = sumAmount / arrayNotes[i];
			System.out.println("Number of " + arrayNotes[i] + " in the amount is " + sumAmount);
			totalNotes = totalNotes + sumAmount;
			amount = amount % arrayNotes[i];
			i++;
		}
		System.out.println("Total Number of Notes in the amount is : " + totalNotes);
	}

}
