package associationpack;

class Person{
	String name;
	long id;
	public Person(String name, long id) {
		this.name = name;
		this.id = id;
	}
}

class Passport extends Person{
	String maidenName;

	public Passport(String name, long id,String maidenName) {
		super(name, id);
		this.maidenName = maidenName;
		
	}
	public void display() {
		System.out.println(id+"\t"+name+"\t\t"+maidenName);
	}
	
}
public class OneToOne {

	public static void main(String[] args) {
		Passport passport = new Passport("Athira",1,"Sujatha");
		passport.display();
	}

}
