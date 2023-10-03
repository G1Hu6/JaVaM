import java.util.*;
class ArrayE02{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter size of Array :");
                int size = sc.nextInt();

                int arr[] = new int[size];
                System.out.println("Enter elements in array :");
                for(int i = 0; i<arr.length; i++){
                        arr[i] = sc.nextInt();
                }

		sortArray(arr, size);
		System.out.println("Sorted array of 0s, 1s and 2s :");
		for(int i = 0; i<arr.length; i++){
                        System.out.println(arr[i] +" ");
                }

	}

	static void sortArray(int arr[], int n){
		int s = 0;
		int m = 0;
		int e = n-1;

		while(m <= e){
			if(arr[m] == 0){
				int temp = arr[m];
				arr[m] = arr[s];
				arr[s] = temp;

				s++;
				m++;
			}else if(arr[m] == 1){
				m++;
			}else if(arr[m] == 2){
				int temp = arr[m];
				arr[m] = arr[e];
				arr[e] = temp;

				e--;
			}
		}
	}
}
