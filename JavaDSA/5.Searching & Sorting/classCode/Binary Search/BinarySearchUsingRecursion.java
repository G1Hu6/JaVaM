import java.util.*;

class BinarySearch{
        static int binarySearch(int arr[], int start, int end, int key){
	/*
               if(start > end)
		       return -1;
                
               int mid = (start + end)/2;
	       if(arr[mid] == key)
		       return mid;
	       if(arr[mid] > key)
  		       end = mid - 1;
	       if(arr[mid] < key)
		       start = mid + 1;

	       return binarySearch(arr,start,end,key);
	*/
		if(start > end)
                       return -1;

               int mid = (start + end)/2;
               if(arr[mid] == key)
                       return mid;
	       else if(arr[mid] > key)
                       return binarySearch(arr,start,mid-1,key);
               else
                       return binarySearch(arr,mid+1,end,key);
        }
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int arr[] = new int[]{4,5,7,19,27,89,97};
                int key = sc.nextInt();

		int start = 0;
		int end = arr.length-1;
                int ans = binarySearch(arr,start, end, key);
                if(ans == -1){
                        System.out.println("Element Not Found");
                }else{
                        System.out.println("Element Found at index " + ans);
                }
        }
}

