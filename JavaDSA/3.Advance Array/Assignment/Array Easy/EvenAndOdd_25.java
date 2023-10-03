import java.util.*;
class ArrayE25{
	static void swapEvenOdd(int arr[], int n){
		int s1 = 0;
		int s2 = 1;
		while(s2 < n && s1 < n-1){ 
			if(s1%2 == 0 && arr[s1]%2 !=0) && (s2%2 != 0 && arr[s2]%2 ==0){
				int temp = arr[s1];
				arr[s1] = arr[s2];
				arr[s2] = temp;

				
			}else{
				
			}
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
	}
}
