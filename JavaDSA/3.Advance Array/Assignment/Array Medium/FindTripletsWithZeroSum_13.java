import java.util.*;
class ArrayM13{
	static int tripletsSum(int arr[], int n){
		for(int i = 0; i < n; i++){
			int sum = arr[i];
			for(int j = i+1; j < n; j++){
				sum = sum + arr[j];
				if()
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
	}
}
