//two diamentional array using foreach loop

class forTwoDim{
	public static void main(String[] args){
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int[] rowValue : arr){
			for(int colValue : rowValue){
				System.out.print(colValue+" ");
			}
			System.out.println();
		}
	}
}