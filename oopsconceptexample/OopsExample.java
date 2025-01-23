package oopsconceptexample;

class CarPurchase {
	public void enquiry() {
		System.out.println("Enquiry for a new car");
	}
}

class Tiago extends CarPurchase {
	// <----------------Override-------------------->
	@Override
	public void enquiry() {
		System.out.println("Enquiry for a new trending car");
	}

	// <----------------Override--------------------->

	// <----------------Overload--------------------->
	public int quote(int onRoadPrice, int discount) {
		return onRoadPrice - discount;
	}

	public double quote(double onRoadPrice, double discount) {
		return onRoadPrice - discount;
	}
	// <-------------------Overload---------------------->
}

//<---------------------Encapsulation-------------------
class Owner {
	private String name;
	private String phoneNumber;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
//<---------------------Encapsulation-------------------

//<---------------------Abstraction---------------------
abstract class TestDrive {
	public abstract void run();

	public void preBooked() {
		System.out.println("Car is booked for test drive!");
	}
}

class Test extends TestDrive {
	public void run() {
		System.out.println("Car is running.....");
	}
}
//<---------------------Abstraction---------------------

//<---------------------Multiple inheritance-------------
interface VehicleTax {
	int numberOfYears = 15;

	public abstract void tax();
}

interface VehiclePollution {
	public abstract void pollutionCertificate();
}

class RCBook implements VehicleTax, VehiclePollution {
	public void tax() {
		System.out.println("Road tax is paid for " + numberOfYears + " years.");
	}

	public void pollutionCertificate() {
		System.out.println("Pollution certificate is issued for 1 year.");
	}
}

//<---------------------Multiple inheritance-------------

public class OopsExample {

	public static void main(String[] args) {
		CarPurchase carpurchase = new CarPurchase();
		carpurchase.enquiry();
		Tiago tiago = new Tiago();
		tiago.enquiry();
		System.out.println("--------------------------");
		System.out.println("Quotations for XY and XY+");
		System.out.println("--------------------------");
		System.out.println("Tiago varient XY quote amount: " + tiago.quote(560000, 5000));
		System.out.println("Tiago varient XY+ quote amount: " + tiago.quote(660000, 5000));
		Owner owner = new Owner();
		System.out.println("----------------");
		System.out.println("Details of purchase");
		System.out.println("----------------");
		owner.setName("Athira");
		owner.setPhoneNumber("9188311335");
		System.out.println("Name: " + owner.getName());
		System.out.println("Phone Number: " + owner.getPhoneNumber());
		RCBook rcbook = new RCBook();
		rcbook.tax();
		rcbook.pollutionCertificate();

	}

}
