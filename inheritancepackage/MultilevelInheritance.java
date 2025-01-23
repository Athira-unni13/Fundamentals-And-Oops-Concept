//Multilevel Inheritance

package inheritancepackage;

class Students {
	String name = "athira";
}

class CollegeStrudents extends Students {
	String course = "MCA";

}

class McaStudent extends CollegeStrudents {
	String streamName = "Java";

	public void showDetails() {
		System.out.println(name + "\t" + course + "\t" + streamName);
	}
}

class MultilevelInheritance {
	public static void main(String[] args) {
		McaStudent clgstud = new McaStudent();
		clgstud.showDetails();
	}

}
