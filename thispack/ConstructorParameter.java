

package thispack;

class Constructor{
	Constructor(parameter p){
		System.out.println(p);
	}
} 
class parameter{
	parameter(){
		Constructor c = new Constructor(this);
	}
}

public class ConstructorParameter {

	public static void main(String[] args) {
		parameter p =new parameter();
	}

}
