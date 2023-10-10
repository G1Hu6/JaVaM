import java.util.*;
class ArrayDemo5{
	static void printSum(int arr[], int n){
		int s = 0;
		int e = n-1;

		while(s <= e){
			if(s == e){
				System.out.print(arr[s] + " ");
			}else{
				System.out.print(arr[s] + arr[e] + " ");
			}
			s++;
			e--;
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
		printSum(arr, size);
	}
}
