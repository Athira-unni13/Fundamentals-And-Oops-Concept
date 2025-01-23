package accessclasspack;

import accessclasspackdemo.Employee; //The type accessclasspackdemo.Employee is not visible: In the accessclasspackdemo Employee class is default

public class StudentDetails {

	public static void main(String[] args) {
		Student obj = new Student(1,"Athira");
		obj.print();
		Employee emp = new Employee(2,"Unni"); //Employee cannot be resolved to a type
		emp.show();
	}

	
}
