package staticpack;

public class StaticBlockTest {
	static {
		System.out.println("Static Block!");     //Only run once when the execution  
	}
	{
		System.out.println("Non-Static Block!"); //runs when the object constructed

	}

	public static void main(String[] args) {
		StaticBlockTest obj1 = new StaticBlockTest();
		StaticBlockTest obj2 = new StaticBlockTest();

	}

}
