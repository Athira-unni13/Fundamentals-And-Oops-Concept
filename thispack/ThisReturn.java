package thispack;
class StudentDetails{
	public void showCourse() {
		System.out.println("Java");
	}
	public StudentDetails display() { //student is passed to display
		System.out.println("Bini");
		return this; //this keyword return student so the method want the datatype as StudentDetails 
	}
}

public class ThisReturn {

	public static void main(String[] args) {
		StudentDetails student = new StudentDetails();
		student.display().showCourse();
	}

}
/*
 * this.roll - variable 
 * this() - constructor 
 * this.display - method return 
 * this - return the object or instance variable
 */