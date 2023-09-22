import java.util.*;
class ArrayB33{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter size of Array :");
                int size = sc.nextInt();

                int arr[] = new int[size];
                System.out.println("Enter elements in array :");
                for(int i = 0; i<arr.length; i++){
                        arr[i] = sc.nextInt();
                }
		System.out.println("Multiplication of sum Left and Right subarrays :");
		System.out.println(ArrayB33.multiplySumOf2Subarrays(arr, size));
	}
	static int multiplySumOf2Subarrays(int arr[], int n){
		int s = 0;
                int e = n-1;
		int m = 0;
		int leftSum = 0, rightSum = 0;
		if(n%2 == 0)
                	m = s+(e-s)/2;
		else
			m = s-1+(e-s)/2;
		System.out.println(m);
		while(e>m){
			if(s<=m){
				leftSum = leftSum + arr[s];
				s++;	
			}
			leftSum = leftSum + arr[e];
			e--;
		}
		return rightSum*leftSum;
	}
}
