import java.util.Arrays;

class MergeSort{
	
	static void mergeSortRec(int arr[], int start, int end){
	
		if(start < end){
		
			int mid = start + (end - start)/2;

			mergeSortRec(arr, start, mid);
			mergeSortRec(arr, mid+1, end);
			merge(arr, start, mid, end);
		}
	}

	static void merge(int arr[], int start, int mid, int end){
	
		int n1 = mid-start+1;
		int n2 = end-mid;

		int arr1[] = new int[n1];
		int arr2[] = new int[n2];

		// coping data in arrays
		for(int i = 0; i < n1; i++){
			arr1[i] = arr[i+start];
		}
		
		for(int i = 0; i < n2; i++){
			arr2[i] = arr[i+mid+1];
		}

		int i = 0, j = 0, k = start;

		while(i < arr1.length && j < arr2.length){
		
			if(arr1[i] < arr2[j]){
				arr[k] = arr1[i];
				i++;
			}else{
				arr[k] = arr2[j];
				j++;
			}
			k++;
		}

		while(i < arr1.length){
			
			arr[k] = arr1[i];
			i++;
			k++;
		}

		while(j < arr2.length){
		
			arr[k] = arr2[j];
			j++;
			k++;
		}
	}

	public static void main(String[] args){
	
		int arr[] = {9, 1, 8, 2, 7, 3, 6, 4};

		int start = 0;
		int end = arr.length - 1;
		mergeSortRec(arr, start, end);

		System.out.println(Arrays.toString(arr));
	}
}
