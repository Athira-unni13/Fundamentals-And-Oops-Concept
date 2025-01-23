package superpack;


class Display{
	Display(){
		System.out.println("Super class constrctor called!");
	}
}
class Show extends Display{
	Show(){
		super();//called the constructor of immediate superclass//if we use super or this must be the first line in the constructor
		// even after super() is not used the compiler will call super() implicitly
		System.out.println("Subclass--show constrctor called!");

	}
}
public class SuperClassExample {

	public static void main(String[] args) {
		Show show = new Show();
	}

}
