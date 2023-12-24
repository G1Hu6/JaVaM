/*
 Q(1) Print 2D matrix column-by-column.

*/

class PrintColumnByColumn{

	public static void main(String[] args){
	
		int arr[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};	

		// Print Column wise
		for(int i = 0; i < arr[0].length; i++){
		
			for(int j = 0; j < arr.length; j++){
			
				System.out.print(arr[j][i] + " ");
			}
			System.out.println();
		}
	}
}
