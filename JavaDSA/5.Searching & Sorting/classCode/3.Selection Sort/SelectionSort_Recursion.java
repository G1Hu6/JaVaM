class SelectionSort{

	static void selectionSortByRec(int arr[], int n){
	
		if(n == 2){
			return;
		}
		
		int minIdx = arr.length-n;
		for(int i = arr.length-n+1; i < arr.length; i++){
		
			if(arr[i] < arr[minIdx]){
				minIdx = i;
			}
		}

		int temp = arr[minIdx];
		arr[minIdx] = arr[arr.length-n];
		arr[arr.length-n] = temp;

		selectionSortByRec(arr, n-1);
	}

	public static void main(String[] args){
	
		int arr[] = {8, 3, 1, 7, 5, 4, 2};

		selectionSortByRec(arr, arr.length);

		for(int i = 0; i < arr.length; i++){
		
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
