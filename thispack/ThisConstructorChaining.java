package thispack;

class construct {
	int one;
	int two;

	construct() {
		this(75);//this() or super() must add first in the construct
		System.out.println("inside default constructor!");
	}

	construct(int one) {
		this(one, 45);
		System.out.println("inside single argument constructor!");
	}

	construct(int one, int two) {
		this.one = one;
		this.two = two;
		System.out.println("Full argument constructor!");
	}

	public void display() {
		System.out.println(one + " " + two);
	}
}

public class ThisConstructorChaining {

	public static void main(String[] args) {
		construct obj = new construct();
		obj.display();
	}

}
