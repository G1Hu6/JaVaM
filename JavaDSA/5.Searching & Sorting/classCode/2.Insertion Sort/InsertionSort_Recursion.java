class InsertionSort_Recursion{

	static void insertionSortRec(int arr[], int n){
	
		if(n == 1){
			return;
		}

		int j = (arr.length -n);
		int element = arr[arr.length -n + 1];
		while(j >= 0 && arr[j] > element){
		
			arr[j+1] = arr[j];
			j--;
		}
		arr[j+1] = element;

		insertionSortRec(arr, n-1);
	}
	public static void main(String[] args){
	
		int arr[] = {8, 3, 1, 7, 5, 4, 2};

		insertionSortRec(arr, arr.length);

		for(int i = 0; i < arr.length; i++){
		
			System.out.print(arr[i] + " ");
		}
	}
}
