class Arr2Dadd{
	public static void main(String[]args){
	//	int arr[][]=new int[][];  error: array dimension missing
		//int arr[][]=new int[3][];//java gives more priority to row 
	//	int arr[][]=new int[][3];//error: ']' expected	
		
		int arr[][]=new int[2][2];

		arr[0][0]=11;
		arr[0][1]=11;
		arr[1][0]=11;
		arr[1][1]=11;

		for(int var1[]:arr){
			for(int p:var1){
                         	 System.out.println(p);
                	}
		}


		System.out.println(System.identityHashCode(arr[0][0]));
		System.out.println(System.identityHashCode(arr[0][1]));
		System.out.println(System.identityHashCode(arr[1][0]));//same
		System.out.println(System.identityHashCode(arr[1][1]));

		System.out.println(arr[0]);
		System.out.println(arr[1]);    //This all having same address Representstion as the 1D array this proves that three other Objects are created 
		                               //with new keyword internally "[I-----------"
		
		System.out.println(arr);// [[I------
		int x=11;
		System.out.println(System.identityHashCode(x));

	}
}
