//Question 30: Write a program to find the maximum and minimum element in an array

package assignment;

import java.util.Scanner;

public class MaxAndMinInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the size of array you want to sort: ");
		n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter " + n + " Elements");

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		sc.close();
		int temp;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Largest Value in Array is: " + arr[n - 1]);
		System.out.println("Smallest Value in Array is: " + arr[0]);

	}

}
