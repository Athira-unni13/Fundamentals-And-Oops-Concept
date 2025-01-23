/*Any static method or variable can be called anywhere inside the same class 
 * but non-static methods or variable can't be called inside a static initialiser block or static method*/

package staticpack;

class Demo {
	static int num = 25;
	int value = 12;

	public  void display() {
		System.out.println(num);
	}

	public static void print() {
		// System.out.println(num);//Cannot make a static reference to the non-static
		// field num
		System.out.println(value); // non static data members can't be accessed inside a static method or static
									// initialiser block
		display();// Cannot make a static reference to the non-static method display() from the
					// type Demo//Non Static methods can't be invoked inside static method or static
					// initialiser block
	}

	static {
		// System.out.println(num);

		display();// Cannot make a static reference to the non-static method display() from the
					// type Demo
		print();
	}

}

public class LimitationStatic {

	public static void main(String[] args) {

	}

}
