import java.util.*;
class ArrayM28{
	static void findRepeatingAnsMissing(int arr[], int n){
		int ans = 0;
		int count = 0;
		for(int i = 1; i <= n; i++){
			count = 0;
			for(int j = 0; j < n; j++){
				if(i == arr[j]){
					count++;
				}
			}
			if(count == 2){
                                System.out.print(i + " ");
                        }
                        if(count == 0){
                                ans = i;
                        }	
		}
		System.out.println(ans);
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

		System.out.println("Missing And Repeating Elements =");
		findRepeatingAnsMissing(arr, size);
	}
}
