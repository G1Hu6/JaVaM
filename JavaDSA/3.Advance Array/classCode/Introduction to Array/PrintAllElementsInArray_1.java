import java.util.*;

class PrintElements{
	static void printArr(int arr[], int n){
		for(int i = 0; i < n; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of size =");
		int size = sc.nextInt();
		
		System.out.println("Enter Elements = ");
		int arr[] = new int[size];
		for(int i = 0; i < arr.length; i++){
			arr[i] = sc.nextInt();
		}
		printArr(arr, size);
	}
}
