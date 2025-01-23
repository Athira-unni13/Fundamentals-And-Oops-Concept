package oops;

class Employee {
	int empNo;
	String empName;

	Employee() {
		empNo = 24;
		empName = "Athira";
	}

}

public class DemoThree {

	public static void main(String[] args) {

		// obj1 creation
		Employee obj1 = new Employee();
		System.out.println(obj1.empNo + "\t" + obj1.empName);

		// obj2 creation
		Employee obj2 = new Employee();
		System.out.println(obj2.empNo + "\t" + obj2.empName);
	}

}
