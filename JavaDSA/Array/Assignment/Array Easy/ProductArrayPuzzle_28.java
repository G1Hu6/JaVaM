import java.util.*;
class ArrayE28{

	static int[] productArray(int arr[], int n){
		int mul = 1;
		int mul0 = 1;
		int ans[] = new int[n];
		for(int i = 0; i < n; i++){
			mul = mul * arr[i];
			if(true){
				if(arr[i]== 0)
					mul0 = mul0 * 1;
				else 
					mul0 = mul0 * arr[i];	
			}
		}
		for(int i = 0; i < n; i++){
			if(mul == 0){
				if(arr[i] == 0)
					ans[i] = mul0;
				else
					ans[i] = 0;
			}else{
				ans[i] = mul/arr[i];
			}
		}
		return ans;
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

		System.out.println("Product Array = ");
		int ans[] = productArray(arr, size);
		for(int i = 0; i<arr.length; i++){
                        System.out.print(ans[i] + " ");
                }
		System.out.println();
	}
}
