import java.util.*;
class ArrayE09{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter size of Array :");
                int size = sc.nextInt();

                int arr[] = new int[size];
                System.out.println("Enter elements in array :");
                for(int i = 0; i<arr.length; i++){
                        arr[i] = sc.nextInt();
                }

		System.out.println(findTransition(arr, size));
	}

	static int findTransition(int arr[], int n){
		int s = 0;
		int e = n-1;
		int m = 0;
		int ans = -1;
		while(s < e){
			m = s + (e - s)/2;

			if(arr[m] == 0){
				s = m +1;	
			}else{
				ans = s;
				e = m;
			}
		}
		return ans;
	}
}

