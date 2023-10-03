import java.util.*;
class ArrayB30{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter size of Array :");
                int size = sc.nextInt();

                int arr[] = new int[size];
                System.out.println("Enter elements in array :");
                for(int i = 0; i<arr.length; i++){
                        arr[i] = sc.nextInt();
                }
		System.out.println("Enter Number for finging its closest element :");
                int k = sc.nextInt();
		System.out.println("Closest element is :");
		System.out.println(ArrayB30.findClosest(arr, size, k));
	}

	static int findClosest(int arr[], int n, int k){
		int s = 0, e = n-1;
		int m, ans = 0;
		while(s<=e){
			m = s + (e - s)/2;

			if(Math.abs(arr[m]-k) > Math.abs(arr[m+1]-k)){
				s = m+1;
			}else if(Math.abs(arr[m]-k) < Math.abs(arr[m+1]-k)){
				ans = m;
				e = m-1;
			}else if(Math.abs(arr[m]-k) == Math.abs(arr[m+1]-k)){
				ans = m+1;
				s = m+1;	
			}
		}
		return arr[ans];
	}
}
