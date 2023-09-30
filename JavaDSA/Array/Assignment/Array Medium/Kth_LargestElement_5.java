import java.util.*;
class ArrayM05{
	static void kthMax(int arr[], int n, int k){
		for(int i = 0; i < n; i++){
			for(int j = 1; j < n-i; j++){
				if(arr[j-1] > arr[j]){
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
			if(i < k)
				System.out.print(arr[n-i-1] + " ");
		}
		System.out.println();
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

		System.out.println("Enter value Of K = ");
                int k = sc.nextInt();

		System.out.println("Largest Elements : ");
		kthMax(arr, size, k);
	}
}
