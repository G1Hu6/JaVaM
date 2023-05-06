class JaggedArr2{
	public static void main(String []p){
		//int arr[][]={{1,2,3},{4,5,7},{6,9,0}}; Jagged Array.
		int arr[][]={{1,2,3},{4,5},{6}};
		/*
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(arr[i][j]+" ");// error:1 2 3 
                                                                      // 4 5 Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 
								      // Index 2 out of bounds for length 2
			}
			System.out.println("");
		}
		*/
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				 System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}

		//For Each
		for(int[] x:arr){
			for(int y:x){
				//System.out.print(x);//print address of 1D array
				  System.out.print(y+" ");
			}
			System.out.println();
		}
	}
}
