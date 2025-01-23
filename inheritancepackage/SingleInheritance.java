//Single Inheritance

package inheritancepackage;

class Student {
	String name = "athira";
}

class CollegeStrudent extends Student {
	String course = "MCA";

	public void showDetails() {
		System.out.println(name + "\t" + course);
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		CollegeStrudent clgstud = new CollegeStrudent();
		clgstud.showDetails();
	}

}
