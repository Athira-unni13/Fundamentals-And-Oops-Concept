package test;
//import packagetest.*;
//import packagetest.PackageClass; //best practice
public class TestPackageClass {

	public static void main(String[] args) {
		//PackageClass pc = new PackageClass();
		packagetest.PackageClass pc = new packagetest.PackageClass(); //Not in use
		pc.dispayText("Athira");
	}

}
