package polypack;

abstract class AnonyAbstractDemo {
	public abstract void display();
}

public class AnonymAbstract {

	public static void main(String[] args) {
//-------------Anonymous Method Example---------------------
		AnonyAbstractDemo demo = new AnonyAbstractDemo() {
			public void display() {
				System.out.println("Example for anonymus abstract class!");
			}
		};
//---------------------------------------------------------
		demo.display();
	}

}
