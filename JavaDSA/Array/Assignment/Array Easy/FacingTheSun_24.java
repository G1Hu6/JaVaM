import java.util.*;
class ArrayE24{
	static int countOFbuilding(int arr[], int n){
		int count = 0;
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < n; i++){
			if(arr[i] > max){
				count++;
				max = arr[i];
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

		System.out.println("Total buildings which will see the sunrise = ");
		System.out.println(countOFbuilding(arr, size));
	}
}
