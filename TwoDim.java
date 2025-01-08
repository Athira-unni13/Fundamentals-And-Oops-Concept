//2D Array implementation

import java.util.Scanner;

class TwoDim{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int row,col;
		
		System.out.print("Enter the row size: ");
		row = sc.nextInt();
		
		System.out.print("Enter the column size: ");
		col = sc.nextInt();
		
		int arr[][] = new int[row][col];
		System.out.print("Enter the elements: ");
		
		//Insert elemts
		for(int i = 0; i<row; i++){
			for(int j = 0; j<col; j++){
				arr[i][j] = sc.nextInt();
			}
		}
		
		//Printing elements
		System.out.println("2D Array is:");
		for(int i = 0; i<row; i++){
			for(int j = 0; j<col; j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}