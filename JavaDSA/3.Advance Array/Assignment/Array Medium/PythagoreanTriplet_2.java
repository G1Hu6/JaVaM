import java.util.*;
class ArrayM02{
	static boolean findTriplet(int arr[], int n){
		for(int i = 0; i < n-2; i++){
			for(int j = i+1; j < n-1; j++){
				for(int k = j+1; k < n; k++){
					if((arr[i]*arr[i]+arr[j]*arr[j] ==arr[k]*arr[k]) || (arr[j]*arr[j]+arr[k]*arr[k] == arr[i]*arr[i]) || (arr[k]*arr[k]+arr[i]*arr[i] == arr[j]*arr[j]))
						return true;
				}
			}
		}
		return false;
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
		if(findTriplet(arr, size)){
                System.out.println("Yes");
       		}else{
        	        System.out.println("No");
	        }

	}
}
