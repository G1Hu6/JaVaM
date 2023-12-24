/*
 Q(6) Print left digonal

 */
class LeftDigonal{

	public static void main(String[] args){
	
		int arr[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

		for(int i = 0; i < arr.length; i++){
		
			for(int j = 0; j < arr[i].length; j++){
			
				if(i + j == arr.length - 1){
				
					System.out.println(arr[i][j]);
				}
			}
		}

		int start = 0;
		int end = arr.length-1;
		while(start < arr.length && end >= 0){
		
			System.out.println(arr[start][end]);
			start++;
			end--;
		}
	}
}
