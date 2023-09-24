import java.util.*;
class ArrayE05{
	static int peakElement(int arr[], int n){
		int s = 0, e = n-1;
		int ans = 0;
		while(s < e){
			int m = s + (e - s)/2;
			if(arr[m] < arr[m+1]){
				s = m + 1;
				ans = 1;
			}else{
				ans = 1;
				e = m;
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
		System.out.println(peakElement(arr, size));
	}
}
