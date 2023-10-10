import java.util.*;
class Array{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter size of Array :");
                int n = sc.nextInt();
		int k = sc.nextInt();
                int arr[] = new int[n];
                System.out.println("Enter elements in array :");
                for(int i = 0; i<arr.length; i++){
                        arr[i] = sc.nextInt();
                }

		int ans[] = new int[n+k];
		for(int i = 0; i < n+k; i++){
			if(i < n){
				ans[i] = arr[i];
			}else{
				int temp = ans[i-n];
				ans[i-n] = ans[i];
				ans[i] = temp;
			}
		}
		for(int i = 0; i<arr.length; i++){
			arr[i] = ans[i + k];
                        System.out.print(arr[i] + " ");
                }

	}
}

// Time Complexity = O(N)
// SpaceComplexity = O(N)
