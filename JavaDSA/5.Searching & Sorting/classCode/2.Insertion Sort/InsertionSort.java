class InsertionSort{

	public static void main(String[] args){
	
		int arr[] = {8, 3, 1, 7, 5, 4, 2};

		for(int i = 1; i < arr.length; i++){
		
			int j = i-1;
			int element = arr[i];
			while(j >= 0 && arr[j] > element){
			
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = element;
		}

		for(int i = 0; i < arr.length; i++){
		
			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}
}
