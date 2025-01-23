package staticpack;

class Test {
	static int num = 0;

	Test() {
		num = num + 10;
	}

	public void print() {
		System.out.println("num = " + num);
	}
}

public class StaticSameMemory {

	public static void main(String[] args) {
		Test t1 = new Test();
		//t1.print();
		Test t2 = new Test();
		//t2.print();
		Test t3 = new Test();
		//t3.print();
		Test t4 = new Test();
		//t4.print();
		Test t5 = new Test();
		t1.print();
		t2.print();
		t3.print();
		t4.print();
		t5.print();

	}

}
