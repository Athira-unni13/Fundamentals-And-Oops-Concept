//Question 25:  Write a program to print fibonacci series upto n terms

package assignment;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, first, second, third;
		System.out.println("Enter a number: ");
		n = sc.nextInt();
		sc.close();
		first = 0;
		second = 1;
		third = 0;

		System.out.println("Fibonacci series up to " + n + " terms");
		for (int i = 1; i <= n; i++) {

			System.out.print(first + "\t");
			third = first + second;
			first = second;
			second = third;

		}
	}

}
