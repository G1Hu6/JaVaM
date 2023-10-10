//Time Complexity = O(N)
//Space Complexity = O(N)

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
		System.out.println("Enter total Queries :");
                int Q = sc.nextInt();
	
		int psArr[] = new int[N];
		psArr[0] = arr[0];
		for(int i = 1; i < N; i++){	
			psArr[i] = psArr[i-1] + arr[i];		
		}

		int sum = 0;
		for(int j = 0; j < Q; j++){	//O(N)
			System.out.println("Enter start and end value");
                        int startIndex = sc.nextInt();
                        int endIndex = sc.nextInt();
			if(startIndex == 0){
				sum = psArr[endIndex];
			}else{
				sum = psArr[endIndex] - psArr[startIndex-1];
			}
			System.out.println(sum);
		}
	}
}
