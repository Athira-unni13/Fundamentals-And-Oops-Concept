//String array printing using for each loop

import java.util.Scanner;

class forExample{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String names[] = new String[6];
		System.out.println("Enter the names");
		for(int i = 0; i<6; i++){
			names[i] = sc.next();
		}
		//Displaying names using for each loop
		for(String str:names){
			System.out.print(str+" ");
		}
	}
}