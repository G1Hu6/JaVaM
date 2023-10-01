import java.util.*;
class ArrayM30{
	static int countSubLessProduct(int arr[], int n, int k){
		int count = 0;
		for(int i = 0; i < n; i++){
			int mul = 1;
			for(int j = i; j < n; j++){
				mul = mul * arr[j];
				if(mul < k){
					count++;
				}
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

		System.out.println("Enter Number k :");
                int k = sc.nextInt();
		System.out.println("Count of Subarrays having product less than k = ");
		System.out.println(countSubLessProduct(arr, size, k));
	}
}
