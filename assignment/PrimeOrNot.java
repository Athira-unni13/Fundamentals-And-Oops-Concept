//Question 22: write a program to Check Whether a Given Number is Prime or Not

package assignment;

import java.util.Scanner;
import java.lang.Math;

public class PrimeOrNot{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		boolean isPrime;
		isPrime = true;
		System.out.println("Enter a number");
		number = sc.nextInt();
		sc.close();
		
		if(number<=1) {
			System.out.println(number+" is not a prime");
		}else {
			for(int i=2;i<=Math.sqrt(number);i++) {
				if(number%i == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				System.out.println(number+" is a prime");
			}
			else {
				System.out.println(number+" is not a prime");
			}
		}
	}
}