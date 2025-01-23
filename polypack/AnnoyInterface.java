package polypack;

interface Inter{
	public void display();
}


public class AnnoyInterface {

	public static void main(String[] args) {
		
//-------------Anonymous Method Example---------------------
		Inter in  = new Inter() {
			@Override
			public void display() {
				System.out.println("SAM -> Single Anonymous Method -> Implementation!");
			}
		};
//---------------------------------------------------------
		in.display();
	}

}
