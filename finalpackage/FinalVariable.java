package finalpackage;

class Test {
	final int num; //
	
	Test(){
		num = 10; //blank final variable is not initialised then it must initialised on default constructor only ones.
	}

	public void show() {
		// num = 20;//The final field Test.num cannot be assigned
		System.out.println(num);
	}

	public final void display() {
		System.out.println("hi");
	}
}

/*
 * class demo extends Test{ //The type demo cannot subclass""(Inherit)"" the final class Test
 * 
 * public final void display() { //Cannot ""override"" the final method from
 * Test System.out.println("hi"); }
 * 
 * }
 */

public class FinalVariable {

	public static void main(String[] args) {
		Test test = new Test();
		test.show();
	}

}
