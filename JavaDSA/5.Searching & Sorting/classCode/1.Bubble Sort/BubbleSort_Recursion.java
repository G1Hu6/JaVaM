/*
 Time Complexity = O(N2)
 SpaceComplexity = O(N)

 Best Case = O(1)
 */

class BubbleSort_Recursion{

	static void bubbleSortByRec(int arr[], int n){
	
		if(n == 1){
		
			return;
		}

		boolean flag = true;
		for(int i = 0; i < n-1; i++){
		
			if(arr[i] > arr[i+1]){
			
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
				flag = false;
			}
		}
		
		if(flag == true){
				
				return;
		}

		bubbleSortByRec(arr, n-1);
	}
	public static void main(String[] args){
	
		int arr[] = {7, 3, 9, 4, 2, 5, 6};
		int n = arr.length;

		bubbleSortByRec(arr, n);

		for(int i = 0; i < arr.length; i++){
		
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
