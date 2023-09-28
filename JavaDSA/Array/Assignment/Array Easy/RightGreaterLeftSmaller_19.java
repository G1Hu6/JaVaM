import java.util.*;
class ArrayE19{
	static int returnEle(int arr[], int n){
		/*
		int s1 = 0, s2 = 1;
		int ans = -1;
		while(s1 < n || s2 < n){
			if(s1 > s2 && arr[s2] <= arr[s1]){
				ans = arr[s2];
                                s1++;
			}
			if(s1 < s2 && arr[s1] > arr[s2]){
				s2 = (s2 + 1)%n;
				
			}else{
				s1++;
			}
		}
		return ans;
		*/

		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				if(j <= i){
					if(arr[i] < arr[j])
						break;
				}else{
					if(arr[j] < arr[i])
						break;
				}
			}
		}
		return -1;

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
		System.out.println(returnEle(arr, size));
	}
}
