//Addition of two matrix

import java.util.Scanner;

class addition{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int row1,col1,row2,col2;
		
		System.out.print("Enter the row size of first matrix: ");
		row1 = sc.nextInt();
		
		System.out.print("Enter the column size of first matrix: ");
		col1 = sc.nextInt();
		
		System.out.print("Enter the row size of second matrix: ");
		row2 = sc.nextInt();
		
		System.out.print("Enter the column size of second matrix: ");
		col2 = sc.nextInt();
		
		int arr1[][] = new int[row1][col1];
		int arr2[][] = new int[row2][col2];
		int result[][] = new int[row1][col1];
		
		
		if(row1 != row2 || col1 !=col2){
			System.out.println("Both matrix want same number of row and column size");
			return;
		}
		
		//Insert elements for each matrix
		
		System.out.print("Enter the elements for first Matrix: ");
		for(int i = 0; i<row1; i++){
			for(int j = 0; j<col1; j++){
				arr1[i][j] = sc.nextInt();
			}
		}
		System.out.print("Enter the elements for second Matrix: ");
		for(int i = 0; i<row2; i++){
			for(int j = 0; j<col2; j++){
				arr2[i][j] = sc.nextInt();
			}
		}
		
		//Add two matrix
		
		for(int i = 0; i<row1; i++){
			for(int j = 0; j<col1; j++){
				result[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		
		//print elements in the result matrix
		
		System.out.println("Resultant Matrix is:");
		for(int i = 0; i<row1; i++){
			for(int j = 0; j<col1; j++){
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
	}
}