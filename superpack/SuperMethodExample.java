package superpack;

class Test{
	int balance =100;
	public void display() {
		System.out.println("Superclass Method diplay!");
	}
}
class Trial extends Test{
	//int balance =100;// this mean variable balance created here then the outputs will be 444 & 100
	public void display() {
		System.out.println(balance);
	}
	public void show() {
		
		balance = 444; // here balance is shared among 2 classes,
		System.out.println(balance);// so 444
		System.out.println(super.balance);//444
	}
	
}

public class SuperMethodExample {

	public static void main(String[] args) {
		Trial trial = new Trial();
		trial.show();
		System.out.println(trial.balance);//444
		Test test =new Test();
		System.out.println(test.balance);//100
		
	}

}
