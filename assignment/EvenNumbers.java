//Question 17: Write a program to print all even numbers between 1 to 100

package assignment;

public class EvenNumbers {

	public static void main(String[] args) {
		System.out.println("All the even numbers from 1 to 100");

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

	}
}
