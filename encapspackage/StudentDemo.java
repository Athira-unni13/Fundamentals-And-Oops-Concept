//POJO = plain object java / java bean class

package encapspackage;

class Student {
	private int rollNo;
	private String name;

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}

public class StudentDemo {

	public static void main(String[] args) {
		Student student = new Student();
		student.setRollNo(24);
		student.setName("Athira");
		
		System.out.println(student.getRollNo()+"  "+student.getName());
		

	}

}
