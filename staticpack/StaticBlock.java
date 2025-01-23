/*OutPut
//Static block gets called ones , when the class itself initialised, No matter how many object created 
Static block
//Non Static block gets called every time when the instance of class constructed
Non-static block
Non-static block
*/


package staticpack;

class ExampleStaic{
	static {
		System.out.println("Static block");
	}
	{
		System.out.println("Non-static block");
	}
}

public class StaticBlock {

	public static void main(String[] args) {
		ExampleStaic obj1 = new ExampleStaic();
		ExampleStaic obj2 = new ExampleStaic();


	}

}
