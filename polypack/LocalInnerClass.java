package polypack;

class MainOuter{
	int count = 1;
	public void dispaly() {
		//------local Inner class(class Inside a method)----------
		
		for(int i = 1;i<=5;i++) {
			 class InnerClass{  //we can't use access modifier for local inner class
				public void show() {
					System.out.println("Inside Inner class - using count "+count);
					count++;
				}
			}
				InnerClass obj2 = new InnerClass();
				obj2.show();
			
		}
	}
}

public class LocalInnerClass {

	public static void main(String[] args) {
		MainOuter obj = new MainOuter();
		obj.dispaly();
	}

}
