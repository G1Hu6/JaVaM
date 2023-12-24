class SelectionSort{

	public static void main(String[] args){
	
		int arr[] = {8, 3, 1, 7, 5, 4, 2};

		for(int i = 0; i < arr.length-1; i++){
		
			int minIdx = i;
			for(int j = i+1; j < arr.length; j++){
				if(arr[j] < arr[minIdx]){
				
					minIdx = j;
				}
			}

			int temp = arr[minIdx];
			arr[minIdx] = arr[i];
			arr[i] = temp;
		}

		for(int i = 0; i < arr.length; i++){
		
			System.out.print(arr[i] + " ");
		}
	}
}
