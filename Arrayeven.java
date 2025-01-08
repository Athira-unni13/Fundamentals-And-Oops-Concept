//insert values and print even numbers

import java.util.Scanner;

class Arrayeven{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.print("Enter the size of array: "+"\n");
		size = sc.nextInt();
		int[] arr = new int[size];
		for(int i = 0; i<size; i++){
			System.out.print("Enter a value: ");
			arr[i] = sc.nextInt();
		}
		System.out.println("Even Numbers in the array are: ");
		for(int i =0; i<size; i++){
			if(arr[i]%2 == 0){
				System.out.print(arr[i]+" ");
			}
		}
	}
}