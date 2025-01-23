package polypack;

class Demo {
	int sum(int one, int two) {
		int sum;
		sum = one + two;
		return sum;
	}

	float sum(int one, float two) {
		float sum;
		sum = one + two;
		return sum;
	}

	double sum(int one, int two, float three) {
		double sum;
		sum = one + two + three;
		return sum;
	}

	int sum(int one) {
		int sum;
		sum = one + 20;
		return sum;
	}

	double sum(int one, float two, double three) {

		double sum;
		sum = one + two + three;
		return sum;
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		Demo demo = new Demo();
		System.out.println("Sum = " + demo.sum(2, 4));
		System.out.println("Sum = " + demo.sum(2, 4.3f));
		System.out.println("Sum = " + demo.sum(2, 4, 5.6f));
		System.out.println("Sum = " + demo.sum(2));
		System.out.println("Sum = " + demo.sum(2, 4.9f,8.98));

	}

}
