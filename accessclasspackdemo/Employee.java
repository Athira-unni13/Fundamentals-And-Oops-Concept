package accessclasspackdemo;

public class Employee { //default class is only accessible inside the same package so remove error we should declared in public 
	int empId;
	String empName;
	public Employee(int empId, String empNmae) {
		this.empId = empId;
		this.empName = empNmae;
	}
	public void show() {
		System.out.println(empId+" "+empName);
	}
}
