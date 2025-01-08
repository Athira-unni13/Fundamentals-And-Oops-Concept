import java.util.Scanner;

class Arraydemo{
	public static void main(String[] args){
		Scanner sc =  new Scanner(System.in);
		int size;
		System.out.println("Enter the size of the array");
		 size  = sc.nextInt();
		int ar[] = new int[size];
		for(int i = 0;i<size;i++){
			System.out.print("Enter a value: ");
			ar[i] = sc.nextInt();
		}
		for(int i = 0; i < size; i++){
			ar[i]+=5;
		}
		System.out.println("The array elements are: ");
		for(int i = 0;i < size; i++){
			System.out.print(ar[i]+" ");
		}
	}
	
}