package polypack;

class Doctor{
	public  void treatPatient() {
		System.out.println("Checking the patient");
	}
}
class Surgeon extends Doctor{
	public  void treatPatient() {
		System.out.println("Surgery Prescribed!");
	}
}

public class MethodOverRidingDemo {

	public static void main(String[] args) {
		Doctor obj = new Doctor();
		Surgeon obj1 = new Surgeon();
		obj.treatPatient();
		obj1.treatPatient();

	}

}
