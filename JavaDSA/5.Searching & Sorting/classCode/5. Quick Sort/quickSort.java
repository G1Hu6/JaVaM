import java.util.Arrays;

class QuickSort{

	static void quickSort(int arr[], int start, int end){
	
		if(start < end){
		
			int pivotIdx = partition(arr, start, end);

			quickSort(arr, start, pivotIdx-1);
			quickSort(arr, pivotIdx+1, end);
		}
	}

	static int partition(int arr[], int start, int end){
	
		int pivot = arr[end];
		int i = start -1;

		for(int j = start; j < end; j++){
			
			if(arr[j] <= pivot){

				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		i++;
		int temp = arr[i];
		arr[i] = arr[end];
		arr[end] = temp;
		return i;
	}

	public static void main(String[] args){
	
		int arr[] = new int[]{9, 7, 6, 3, 4, 8, 5};

		int start = 0, end = arr.length-1;
		quickSort(arr, start, end);

		System.out.println(Arrays.toString(arr));
	}
}
