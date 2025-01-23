package thispack;

class ThisMethod{
	public void show() {
		System.out.println("In show method!");
		print(this);
	}
	
	public void print( ThisMethod ob) {
		System.out.println(ob);
	}
}

public class MethodParameter {

	public static void main(String[] args) {
		ThisMethod obj = new ThisMethod();
		obj.show();
	}

}
