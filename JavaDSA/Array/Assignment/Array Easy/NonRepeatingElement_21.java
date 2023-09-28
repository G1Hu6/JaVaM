import java.util.*;
class ArrayE21{
	static int nonRepet(int arr[], int n){
		for(int i = 0; i < n; i++){
			int flag = 0;
			for(int j = 0; j < n; j++){
				if((arr[i] == arr[j]) && (i != j)){
					flag = 1;
					break;
				}
			}
			if(flag == 0){
				return arr[i];
			}
		}
		return 0;
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

		System.out.println("Non Reapeating Element = " + nonRepet(arr, size));
	}
}
