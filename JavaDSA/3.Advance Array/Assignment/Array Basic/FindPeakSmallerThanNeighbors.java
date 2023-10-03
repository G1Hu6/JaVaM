import java.util.*;
class ArrayB36{
	static void findPeak(int arr[], int n){
		int flag = 0;
		for(int i = 1; i < n-1; i++){
			if(arr[i]>arr[i+1] && arr[i]>arr[i-1]){
				flag = 1;
				System.out.print(arr[i] + " ");
			}
		}
		
		if(flag == 0)
			System.out.print(arr[n-1] + " ");
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
		System.out.print("Peak elements : ");
		findPeak(arr, size);
	}
}
