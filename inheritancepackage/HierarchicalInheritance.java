//Hierarchical inheritance

package inheritancepackage;

class Operation{
	int one =23;
	int two =24;
}
class Addnumber extends Operation{
	public void printResult() {
		System.out.println("Result= "+(one+two));
	}
}
class MultipleNumber extends Operation{
	public void printResult() {
		System.out.println("Result= "+one*two);
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		Addnumber ad = new Addnumber();
		MultipleNumber mn = new MultipleNumber();
		ad.printResult();
		mn.printResult();
			
	}

}
