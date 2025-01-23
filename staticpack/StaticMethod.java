package staticpack;

class Item {
	public static void print() {
		System.out.println("item class method");
	}
	public void display() {
		print();
	}
}

public class StaticMethod {

	public static void main(String[] args) {
		Item.print();
		/*
		 * Item obj = new Item(); can't call the static method using object bj.print();
		 */
		
	}

}
