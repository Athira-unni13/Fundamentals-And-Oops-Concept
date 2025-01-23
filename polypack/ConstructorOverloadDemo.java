package polypack;

class Student{
	int rollNo;
	String Name;
	float marks;
	Student(){
		rollNo =20;
		Name ="Athira";
		marks =20.5f;
	}
	Student(int rollNo){
		this.rollNo =rollNo;
	}
	Student(String name){
		Name = name;
	}
	Student(float marks){
		this.marks = marks;
	}
	Student(int rollNo, String name){
		this.rollNo = rollNo;
		Name = name;
	}
	Student(String name, float marks){
		Name = name;
		this.marks = marks;
	}
	Student(int rollNo, float marks){
		this.rollNo = rollNo;
		this.marks = marks;
	}
	Student(int rollNo, String name, float marks) {
		this.rollNo = rollNo;
		Name = name;
		this.marks = marks;
	}
	Student(int rollNo, float marks,String name) {
		this.rollNo = rollNo;
		this.marks = marks;
		Name = name;
		
	}
	/*
	 * public void display() {
	 * System.out.println("Roll.No: "+rollNo+"    "+"Name: "+Name+"    "+"Mark: "
	 * +marks); }
	 */
	@Override
	public String toString() {
		return "rollNo=" + rollNo + ", Name=" + Name + ", marks=" + marks;
	}
	
}

public class ConstructorOverloadDemo {

	public static void main(String[] args) {
		Student obj1 = new Student();
		Student obj2 = new Student(20);
		Student obj3 = new Student("Athira");
		Student obj4 = new Student(29.5f);
		Student obj5 = new Student(24,"Sneha");
		Student obj6 = new Student("Sneha",90.6f);
		Student obj7 = new Student(45,24.9f);
		Student obj8 = new Student(23,"Sreya",89.7f);
		Student obj9 = new Student(45,34.0f,"Akhila");
		/*
		 * obj1.display(); obj2.display(); obj3.display(); obj4.display();
		 * obj5.display(); obj6.display(); obj7.display(); obj8.display();
		 * obj9.display();
		 */
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		System.out.println(obj4);
		System.out.println(obj5);
		System.out.println(obj6);
		System.out.println(obj7);
		System.out.println(obj8);
		System.out.println(obj9);

	}

}
