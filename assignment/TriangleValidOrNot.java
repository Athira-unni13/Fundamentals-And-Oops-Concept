//Question 12 : Write a program to input all sides of a triangle and check whether triangle is valid or not 

package assignment;

import java.util.Scanner;

public class TriangleValidOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A, B, C;
		System.out.println("Enter the three lengths of triangle: ");
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		sc.close();
		if ((A + B > C) && (A + C > B) && (C + B > A)) { // only if a+b>c,a+c>b,b+c>a then it is triangle
			System.out.println("This is a Valid Triangle");
		} else {
			System.out.println("This is not a Valid Triangle");
		}
	}

}
