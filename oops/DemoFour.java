package oops;

class Doctor{
	int empId;
	String empName;
	float empSalary;
	
//	Doctor(int id){
//		empId=id;
//	}
//	Doctor(int id,String name,float salary){
//		empId = id;
//		empName= name;
//		empSalary = salary;
//	}
	public void setDetails(int id,String name,float salary) {
		empId = id;
		empName= name;
		empSalary = salary;
	}
	public void printDetails() {
		System.out.print(empId+"\t");
		System.out.print(empName+"\t");
		System.out.print(empSalary+"\n");
	}
}
public class DemoFour {

	public static void main(String[] args) {
		
		Doctor obj1 = new Doctor();//Parameterised constructor
		obj1.setDetails(2, "Athira", 230.9f);
		Doctor obj2 = new Doctor();
		obj2.setDetails(3,"unnikrishnan",250.8f);
		Doctor obj3 = new Doctor();
		obj3.setDetails(4, "sujatha", 290.7f);
		
		
		System.out.println("==============Values of obj1=====================");
		obj1.printDetails();
		
		System.out.println("==============Values of obj2=====================");
		obj2.printDetails();
		
		System.out.println("==============Values of obj3=====================");
		obj3.printDetails();
		
	}

}
