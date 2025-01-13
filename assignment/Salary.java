/*Question 14 : Write a program to input basic salary of an employee and calculate its Gross salary according to following:

Basic Salary <= 10000 : HRA = 20%, DA = 80%
Basic Salary <= 20000 : HRA = 25%, DA = 90%
Basic Salary > 20000 : HRA = 30%, DA = 95%*/

package assignment;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double basicSalary, HRA, DA, grossSalary;
		System.out.print("Enter your Basic Salary: ");
		basicSalary = sc.nextDouble();
		sc.close();

		if (basicSalary <= 10000) {
			HRA = (basicSalary * 20) / 100;
			DA = (basicSalary * 80) / 100;
			grossSalary = basicSalary + HRA + DA;
			System.out.println("Your Gross Salary is: " + grossSalary);
		} else if (basicSalary <= 20000) {
			HRA = (basicSalary * 25) / 100;
			DA = (basicSalary * 90) / 100;
			grossSalary = basicSalary + HRA + DA;
			System.out.println("Your Gross Salary is: " + grossSalary);
		} else if (basicSalary > 20000) {
			HRA = (basicSalary * 30) / 100;
			DA = (basicSalary * 95) / 100;
			grossSalary = basicSalary + HRA + DA;
			System.out.println("Your Gross Salary is: " + grossSalary);
		}

	}

}
