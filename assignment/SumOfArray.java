package assignment;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, sum;
		sum = 0;
		System.out.println("Enter the size of array you want to sort: ");
		n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter " + n + " Elements");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();

		for (int i = 0; i < n; i++) {
			sum = sum + arr[i];
		}

		System.out.print("Sum of values in the Array is: " + sum);
	}

}
