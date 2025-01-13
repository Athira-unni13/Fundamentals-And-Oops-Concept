/*Question 15: Write a program to input electricity unit charges and calculate total electricity bill according to the given condition:

For first 50 units Rs. 0.50/unit
For next 150 units Rs. 0.75/unit
For next 250 units Rs. 1.20/unit
For unit above 250 Rs. 1.50/unit
An additional surcharge of 20% is added to the bill*/

package assignment;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double electricityUnit, bill, totalAmount, remining;
		bill = 0.0;
		System.out.print("Enter amount of electricity unit consumed: ");
		electricityUnit = sc.nextInt();
		sc.close();
		if (electricityUnit < 0) {
			System.out.println("Invalid input Unit charge cannot be negative");
		} else if (electricityUnit <= 50) {
			bill = 0.50 * 50;
		} else if (electricityUnit <= 150) {
			remining = electricityUnit - 50;
			bill = 0.50 * 50 + 0.75 * remining;
		} else if (electricityUnit <= 250) {
			remining = electricityUnit - 150;
			bill = 0.50 * 50 + 0.75 * 150 + 1.20 * remining;
		} else {
			remining = electricityUnit - 250;
			bill = 0.50 * 50 + 0.75 * 150 + 1.20 * 250 + 1.50 * remining;
		}
		totalAmount = bill + (bill * 20) / 100;
		System.out.println("The total amount to Pay : " + totalAmount);
	}

}
