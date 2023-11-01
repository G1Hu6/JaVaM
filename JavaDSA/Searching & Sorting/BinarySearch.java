import java.util.*;

class BinarySearch{
	static int binarySearch(int arr[], int key){
		int start = 0;
		int end = arr.length-1;

		while(start <= end){
			int mid = (start + end)/2;

			if(arr[mid] == key)
				return mid;
			
			if(arr[mid] > key)
				end = mid - 1;
			
			if(arr[mid] < key)
				start = mid + 1;
		}
		return -1;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[]{4,5,7,19,27,89,97};
		int key = sc.nextInt();
		int ans = binarySearch(arr, key);
		if(ans == -1){
			System.out.println("Element Not Found");
		}else{
			System.out.println("Element Found at index " + ans);
		}
	}
}
