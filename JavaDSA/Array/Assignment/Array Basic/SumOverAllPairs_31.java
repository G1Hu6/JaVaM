import java.util.*;
class ArrayB31{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter size of Array :");
                int size = sc.nextInt();

                int arr[] = new int[size];
                System.out.println("Enter elements in array :");
                for(int i = 0; i<arr.length; i++){
                        arr[i] = sc.nextInt();
                }
		System.out.println("Sum of all Pairs =");
		System.out.println(new ArrayB31().sumOfAllPairs(arr, size));
	}
	int sumOfAllPairs(int arr[], int n){
		int sum = 0;
		for(int i = 0; i < n; i++){
			for(int j = i+1; j < n; j++){
				if(Math.abs(arr[j]-arr[i]) > 1)
					sum = sum + (arr[j]-arr[i]);
			}
		}
		return sum;
	}
}
