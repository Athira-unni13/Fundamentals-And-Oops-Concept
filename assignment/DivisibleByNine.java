/*Question 24: Write a program to find number and sum of all integer between 100 and 200 which are divisible by 9*/
package assignment;

public class DivisibleByNine {

	public static void main(String[] args) {
		int sum, count;
		sum = 0;
		count = 0;

		for (int i = 100; i <= 200; i++) {
			if (i % 9 == 0) {
				count++;
				sum = sum + i;
			}
		}
		System.out.print("Total number of integers which are divisible by 9 from 100 to 200 is: " + count + "\n");
		System.out.print("Sum of integers divisible by 9 between 100 and 200 is: " + sum);

	}

}
