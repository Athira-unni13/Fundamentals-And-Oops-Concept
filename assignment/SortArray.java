//Question 28: Write a program to Sort Numeric Array In Ascending Order

package assignment;

import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the size of array you want to sort: ");
		n= sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter "+n+" Elements");
		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextInt(); 
		}
		sc.close();
		int temp;
		System.out.println("Array after sort in Ascending order: ");
		for(int i = 0; i<n;i++) {
			for(int j = i+1;j<n;j++) {
			if(arr[i]>arr[j]) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			}
		}
		for(int i = 0; i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
	}

}

