import java.util.*;
class ArrayM14{
	static int nerestSum(int arr[], int n){
		int max = Integer.MIN_VALUE;
		int ans = -1;
		for(int i = 0; i < n; i++){
			int sum = 0;
			for(int j = i+1; j < n; j++){
				sum = arr[i] + arr[j];
				if(sum <= 0 && sum > max){
					max = sum;
					ans = max;
				}
			}
		}
		return ans;
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

		System.out.println("Maximum sum nereast to zero = ");
		System.out.println(nerestSum(arr, size));
	}
}
