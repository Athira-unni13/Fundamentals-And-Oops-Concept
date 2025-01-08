package oops;

class student{
	int rollNo;
	String name;
	float marks;
	
	//constructor
	/*student(int roll){
		
	}//rule breaks: if any constructor used by the user then the default constructor created by compiler will not be used.
	*/
	student(int roll,String na, float mark){
		rollNo =roll;
		name = na;
		marks = mark;
	} //to solve the above error we need to declare a default constructor
	public void printDetails() {
		System.out.println(rollNo +" "+name+" "+marks);
	}
}

public class StudentDetails {

	public static void main(String[] args) {
		student obj = new student(6,"Athira",50.6f);//if obj is not used any where in the program it will cause error
		//System.out.println(obj.rollNo+" "+obj.name+" "+obj.marks);
		obj.printDetails();
	}

}
