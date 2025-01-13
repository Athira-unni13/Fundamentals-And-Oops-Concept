/*Question 13: Write a program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer. Calculate percentage and grade according to following:

Percentage >= 90% : Grade A
Percentage >= 80% : Grade B
Percentage >= 70% : Grade C
Percentage >= 60% : Grade D
Percentage >= 40% : Grade E
Percentage < 40% : Grade F */

package assignment;

import java.util.Scanner;

public class Percentage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double markP, markC, markB, markM, markCom;
		double percentage = 0.0;
		System.out.print("Enter the Mark of Physics Upon 100: ");
		markP = sc.nextDouble();
		System.out.print("Enter the Mark of Chemistry Upon 100: ");
		markC = sc.nextDouble();
		System.out.print("Enter the Mark of Biology Upon 100: ");
		markB = sc.nextDouble();
		System.out.print("Enter the Mark of Mathematics Upon 100: ");
		markM = sc.nextDouble();
		System.out.print("Enter the Mark of Computer Upon 100: ");
		markCom = sc.nextDouble();
		sc.close();
		percentage = ((markP + markC + markB + markM + markCom) / 500) * 100;

		if (percentage >= 90) {
			System.out.println("Your Grade : A");
		} else if (percentage >= 80) {
			System.out.println("Your Grade : B");
		} else if (percentage >= 70) {
			System.out.println("Your Grade : C");
		} else if (percentage >= 60) {
			System.out.println("Your Grade : D");
		} else if (percentage >= 40) {
			System.out.println("Your Grade : E");
		} else {
			System.out.println("Your Grade : F");
		}

	}

}
