import java.util.*;
class ArrayM11{
	static void maxOfSub(int arr[], int n, int k){
		int i = 0;
		int max = Integer.MIN_VALUE;
		for(int j = 0; j < n; j++){
			if(i > n-k)
				break;
			if(j < k+i){
				if(arr[j] > max)
					max = arr[j];
			}
			if(j == k-1+i){
				if(max > arr[i]){
					System.out.print(max + " ");
				}else{
					System.out.print(arr[i] + " ");
				}
				max = Integer.MIN_VALUE;
				i++;
				j = j-k+2;
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

		System.out.println("Enter value of k :");
                int k = sc.nextInt();
		maxOfSub(arr, size, k);
	}
}
