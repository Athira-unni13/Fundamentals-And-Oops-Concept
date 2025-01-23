package thispack;
class current{
	public void displayName() {
		System.out.println("Athira");
		//call current class method using this
		this.displayRollNo();
	}
	public void displayRollNo() {
		System.out.println("24");
		displayCourse();//Compiler automatically add this
	}
	public void displayCourse() {
		System.out.println("Java");
	}
}
public class ThisCurrentClass {

	public static void main(String[] args) {
		current display = new current();
		display.displayName();
	}

}
