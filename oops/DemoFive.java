package oops;

class teacher {
	int teacherId;
	String teacherName;

	teacher(int id, String name) {
		teacherId = id;
		teacherName = name;
	}

	public teacher(teacher obj) {
		teacherId = obj.teacherId;
		teacherName = obj.teacherName;
	}

	public void printDetails() {
		System.out.println(teacherId + "\t" + teacherName);
	}
}

public class DemoFive {

	public static void main(String[] args) {
		teacher obj1 = new teacher(20, "Bini");
		teacher obj2 = new teacher(obj1);
		obj2.printDetails();
	}

}
