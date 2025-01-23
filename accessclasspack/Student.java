package accessclasspack;

class Student {    //if no access modifier is give by default the access modifier of the class is default
	int rollNo;
	String name;
	public Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}
	
	public void print() {
		System.out.println(rollNo+"  "+name);
	}
}
