/*
1 Athira Kauma
2 Sneha Kauma
3 Sreya Kauma
Since the Static data member common for every objects,Because of  that last object change the value of school as Kauma,
it affect every other objects 
*/

package staticpack;

class participant {
	int rollNo;
	String name;
	static String School="MKHSS";

	participant(int roll, String pname, String Name) {
		rollNo = roll;
		name = pname;
		School = Name;
		}
	
	public void display() {
		System.out.println(rollNo+" "+name+" "+School);
	}
}

public class YouthFestival {

	public static void main(String[] args) {
		participant obj1 = new participant(1,"Athira","MKHSS");
		participant obj2 = new participant(2,"Sneha","MAR");
		participant obj3 = new participant(3,"Sreya","Kauma");
		
		obj1.display();
		obj2.display();
		obj3.display();
	}

}
