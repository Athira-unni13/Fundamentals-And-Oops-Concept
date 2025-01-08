class stringTwoDim{
	public static void main(String[] args){
		String name[][] = {
						{"B","A","D","R"},
						{"Bini","Athi","Devu","Rethu"}
					  };
		
		for(String[] rowValue : name){
			for(String colValue : rowValue){
				System.out.print(colValue+" ");
			}
			System.out.println();
		}
	}
}