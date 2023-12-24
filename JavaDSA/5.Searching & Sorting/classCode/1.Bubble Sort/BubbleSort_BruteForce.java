class BubbleSort_BruteForce{

	public static void main(String[] args){
	
		int arr[] = {7, 3, 9, 4, 2, 5, 6};

		// Bubble sort logic
		for(int i = 0; i < arr.length; i++){
		
			for(int j = 0; j < arr.length-1; j++){		// Use j < (arr.length-i-1) for condition to reduce number of instructions.
			
				if(arr[j] > arr[j+1]){
				
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}

		// Printing sorted array
		for(int i = 0; i < arr.length; i++){
		
			System.out.print(arr[i] + " ");
		}
	}
}
