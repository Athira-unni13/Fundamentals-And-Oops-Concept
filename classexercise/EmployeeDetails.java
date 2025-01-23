package classexercise;

class Employee{
	int empId;//Instance Variable
	String empName;
	static int salary = 10000;//static variable
	Employee(int id,String name){
		empId =id;
		empName =name;
	}
	public void display() {
		int i;//local variable
		i =1;
		System.out.println(i+" "+ empId+" "+empName+" "+salary);
	}
//	public void details() {
//		
//		i =2; //we can use this here because local varable is only accessed inside the method,constructor or block
//		System.out.println(i+" "+ empId+" "+empName);
//	}
}
public class EmployeeDetails {

	public static void main(String[] args) {
		Employee employee = new Employee(12,"Athira");
		employee.display();
		System.out.println(Employee.salary);//static variable is used inside another class by classname.variablename
	}

}
