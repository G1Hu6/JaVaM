import java.util.*;
class ArrayE20{
	/*
	static int findBitonic(int arr[], int n){
		int ans = -1;
		int flag = 0;
		for(int i = 0; i < n-1; i++){
			if(arr[i] > arr[i+1]){
				flag = 1;
				return arr[i];
			}
		}
		if(flag == 0)
			return arr[n-1];
		return -1;
	}*/

	static int findBitonic(int arr[], int n){
		int s = 0;
		int e = n-1;
		
		while(s < e){
			int m = s + (e - s)/2;

			if(arr[m] < arr[m+1]){
				s = m + 1;
			}else{
				e = m;
			}
		}	
		return arr[s];
	}
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter size of Array :");
                int size = sc.nextInt();

                int arr[] = new int[size];
                System.out.println("Enter elements in array :");
                for(int i = 0; i<arr.length; i++){
                        arr[i] = sc.nextInt();
                }
		System.out.println("Bitonic Point = " + findBitonic(arr, size));
	}
}
