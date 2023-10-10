//Time Complexity = O(N)
//Space Complexity = O(1)

import java.util.*;
class ArrayDemo2{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter size of Array :");
                int N = sc.nextInt();
		
                int arr[] = new int[N];
                System.out.println("Enter elements in array :");
                for(int i = 0; i<arr.length; i++){
                        arr[i] = sc.nextInt();
                }

		//Prefix Sum Array
		for(int i = 1; i < N; i++){	
			arr[i] = arr[i-1] + arr[i];		
		}

		for(int i = 0; i<arr.length; i++){
                        System.out.print(arr[i] + " ");
                }
		System.out.println();
	}
}

