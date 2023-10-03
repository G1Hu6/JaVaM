import java.util.*;
class ArrayM03{
	static int findSub(int arr[], int n){
		int count = 0;
		for(int i = 0; i < n; i++){
			int sum = 0;
			for(int j = i; j < n; j++){
				/*
				int sum = 0;
				for(int k = i; k <= j; k++){
					sum = sum + arr[k];
				}
				if(sum == 0)
					count++;
				*/
				sum = sum + arr[j];
				if(sum == 0)
					count++;
			}
		}
		return count;
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
		System.out.println("Count of SubArrays with Sum is 0 = " + findSub(arr, size));
	}
}
