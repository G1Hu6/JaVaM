import java.util.*;
class ArrayM07{
	static void maxSubarray(int arr[], int n){
		int s1 = 0,e1 = 0;
		int max = Integer.MIN_VALUE, start = -1, end = -1;
		for(int i = 0; i < n; i++){
			int sum = 0;
			for(int j = 0; j < n; j++){
				if(arr[j] < 0)
					break;
				sum = sum + arr[j];
				if(sum > max){
					max = sum;
					start = i;
					end = j;
				}else if(max == sum){
					s1 = i;
					e1 = j;
					if((e1-s1+1) > (end-start+1))
						return e1-s1+1;
					else if((e1-s1+1) < (end-start+1))
						return end-start+1;
					else

				}
			}
		}

		for(int i = start; i <= end; i++){
			System.out.println(arr[i] + " ");
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

		System.out.println("Maximum Of SubArray = ");
		maxSubarray(arr, size);
	}
}
