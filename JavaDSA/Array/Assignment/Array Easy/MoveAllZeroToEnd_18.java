import java.util.*;
class ArrayE18{
	static void moveZero(int arr[], int n){
		int s1 = 0;
		int s2 = 0;

		while(s1 < n && s2 < n){
			if(arr[s1] != 0){
				s1++;
				s2++;
			}
			if(arr[s1] == 0 && arr[s2] == 0){
				s2++;
			}
			if(arr[s1] == 0 && arr[s2] != 0){
		
				arr[s1] = arr[s1] + arr[s2];
				arr[s2] = arr[s1] - arr[s2];
				arr[s1] = arr[s1] - arr[s2];
				
				/*
				int temp = arr[s1];
				arr[s1] = arr[s2];
				arr[s2] = temp;*/
				s1++;
				s2++;
			}
		}
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
		moveZero(arr, size);

		System.out.println("Sorted array of Zero =");
                for(int i = 0; i<arr.length; i++){
                       	System.out.print( arr[i] + " ");
                }
		System.out.println();
	}
}
