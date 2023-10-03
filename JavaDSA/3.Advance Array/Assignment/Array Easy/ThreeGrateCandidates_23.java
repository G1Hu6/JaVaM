import java.util.*;
class ArrayE23{
	static int threeTopper(int arr[], int n){
		int max = Integer.MIN_VALUE;
		int smax = Integer.MIN_VALUE;
		int tmax = Integer.MIN_VALUE;

		for(int i = 0; i < n; i++){
			if(arr[i] > max){
				tmax = smax;
				smax = max;
				max = arr[i];
			}
			if(arr[i] < max && arr[i] > smax){
				tmax = smax;
				smax = arr[i];
			}
			if(arr[i] < smax && arr[i] > tmax){
				tmax = arr[i];
			}
		}

		return (max * smax * tmax);
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

		System.out.println("Maximum collective ability of Three Students = ");
		System.out.println(threeTopper(arr, size));
	}
}
