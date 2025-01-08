//largest element in array

import java.util.Scanner;

class largest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int size;
		int largestValue;
		System.out.print("Enter the size of the array: ");
		size = sc.nextInt();
		int arr[] = new int[size];
		
		//Enter the values to array
		for(int i = 0; i< size; i++){
			System.out.print("Enter a value: ");
			arr[i] = sc.nextInt();
		}
		largestValue = arr[0];
		
		//finding the largest Value in array
		for(int i=1; i< size; i++){
			if(largestValue < arr[i]){
				largestValue = arr[i];
			}
		}
		System.out.println("Largest Value in the array is: "+largestValue);
	}
}