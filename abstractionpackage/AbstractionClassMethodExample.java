package abstractionpackage;


abstract class GraphicObject{
	void showShape(){//method declaration/signature
		
	}
	void print() {
		System.out.println("In Graphic object class!");
	}
}

class circle extends GraphicObject{
	void showShape() {
		System.out.println("This is a circle!");
	}
	void display() {
		System.out.println("Inside circle");
	}
}

abstract class rectangle extends GraphicObject{
	
}

class triangle extends GraphicObject{
	void showShape() {
		System.out.println("This is a Triangle!");
	}
}
public class AbstractionClassMethodExample {

	public static void main(String[] args) {
		circle obj = new circle();
		obj.display();
		obj.print();
		obj.showShape();
	}

}
