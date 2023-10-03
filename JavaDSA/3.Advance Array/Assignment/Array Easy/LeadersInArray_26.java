import java.util.*;
class ArrayE26{
	static void findLeaders(int arr[], int n){
		Vector v = new Vector();
		int max = Integer.MIN_VALUE;

		for(int i = n-1; i >= 0; i--){
			if(arr[i] > max){
				v.add(arr[i]);
				max = arr[i];
			}
		}
		for(var data : v){
			System.out.print(data + " ");
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
		System.out.println("Leaders In Array = ");
		findLeaders(arr, size);
	}
}
