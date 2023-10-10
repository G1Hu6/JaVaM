import java.util.*;
class Array{
        static int[] twoSum(int arr[], int k){
		int ans[] = new int[arr.length];

		for(int i = 0; i < arr.length; i++){
			for(int j = i+1; j < arr.length; j++){
				if(arr[i]+arr[j] == k){
					ans[0] = arr[i];
					ans[1] = arr[j];
					return ans;
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

		System.out.println("Enter target element :");
                int key = sc.nextInt();
		for(int i = 0; i<twoSum(arr, key).length; i++){
                        twoSum(arr, key)[i] = sc.nextInt();
                }
	}
}
