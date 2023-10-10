import java.util.*;
class ArrayDemo{
	static int findSecondMax(int arr[], int n){
		int max = Integer.MIN_VALUE;
		int sMax = Integer.MIN_VALUE;

		for(int i = 0; i < n; i++){
			if(arr[i] > max){
				sMax = max;
				max = arr[i];
			}
			if(arr[i] < max && arr[i] > sMax){
				sMax = arr[i];
			}
		}
		return sMax;
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

		System.out.println("Second Max = " + findSecondMax(arr, size));
	}
}

//Time Complexity = O(N)
//Space Complexity = O(1)
