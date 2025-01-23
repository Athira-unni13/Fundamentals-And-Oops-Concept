package abstractionpackage;

interface MedicalEntrance{
	void examination();
	void showRollNo();
}

interface EngEntrance{
	void examination();
	void showName();
}

class Entrance implements MedicalEntrance,EngEntrance{

	public void examination() {
		System.out.println("Entrance Exam result are published");
	}

	@Override
	public void showName() {
		System.out.println("Athira");
		
	}

	@Override
	public void showRollNo() {
		System.out.println("1234");
		
	}
	
}

public class InterfaceDemo {

	public static void main(String[] args) {
		Entrance entrance = new Entrance();
		entrance.examination();
		entrance.showName();
		entrance.showRollNo();
	}
}
