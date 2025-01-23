// this keyword rule 1 :differentiate btw instance variable and local variable

package thispack;

import java.util.Scanner;

class Student {
	int roll;
	String name;

	Student(int roll, String name) {
		this.roll = roll;
		this.name = name;
	}

	public void print() {
		System.out.println(roll + " " + name);
	}
}

public class DifferentiateVariable {

	public static void main(String[] args) {
		int roll;
		String name;
		Scanner sc = new Scanner(System.in);// ctrl+shift+o to import scanner class
		System.out.print("Enter the Roll Number: ");
		roll = sc.nextInt();
		sc.nextLine();// to get the blank space coming after primitive datatype
		System.out.print("Enter the Name: ");
		name = sc.nextLine();
		sc.close();
		Student obj = new Student(roll,name);
		obj.print();
	}

}
