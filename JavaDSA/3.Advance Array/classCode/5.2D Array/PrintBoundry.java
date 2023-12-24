/*
 Q(4) Given a N x N matrix
      print boundry in clockwise fashion.

 */

class PrintBoundryOf2DArray{

	public static void main(String[] args){
	
		  int arr[][] = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};

		  int i = 0;
		  int j = 0;

		  for(; j < arr.length-1; j++){
		  
			  System.out.print(arr[i][j] + " ");
		  }

		  for(; i < arr.length-1; i++){
		  
			  System.out.print(arr[i][j] + " ");
		  }

		  for(; j > 0; j--){

		  	System.out.print(arr[i][j] + " ");
		  }

		  for(; i > 0; i--){
		  
			  System.out.print(arr[i][j] + " ");
		  }

		  System.out.println();
	}
}
