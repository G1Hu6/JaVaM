/*
import java.util.*;
class ArrayM01{
	static int maxDiffIndex(int arr[], int n){
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				if(arr[i]<=arr[j]){
					if(j-i > max)
						max = j-i;
				}
			}
		}
		return max;
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
		System.out.println("Maximum Difference of i And j = ");
		System.out.println(maxDiffIndex(arr, size));
	}
}
*/

import java.util.*;
class ArrayM01{
        static int maxDiffIndex(int arr[], int n){
                int s = 0, e = n-1;
                while(s <= e){
			if(arr[s] >)
                }
                return -1;
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
                System.out.println("Maximum Difference of i And j = ");
                System.out.println(maxDiffIndex(arr, size));
        }
}
