import java.util.*;

class ProductOfArrayElements4{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter size of Array :");
                int size = sc.nextInt();

                int arr[] = new int[size];
                System.out.println("Enter elements in array :");
		for(int i = 0; i<arr.length; i++){
                        arr[i] = sc.nextInt();
                }
		
		long mod =Integer.MAX_VALUE;
		int product = 1;
		for(int i = 0; i<arr.length; i++){
			product =product*arr[i]; 
		}
		System.out.println("Product of Elements in Array :");
		System.out.println(product%mod);
	}
}
