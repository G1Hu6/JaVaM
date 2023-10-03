import java.util.*;
class ArrayE10{
	static int findFirstRepet(int arr[], int n){
		for(int i = 0; i<n-1; i++){
			for(int j = i+1; j<n; j++){
				if(arr[i] == arr[j])
					return i+1;
			}
		}
		return -1;
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
		System.out.println("First repeating element :");
		System.out.println(findFirstRepet(arr, size));
	}
}
