import java.util.*;
class RemoveElement{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter size of Array :");
                int size = sc.nextInt();

                int arr[] = new int[size];
                System.out.println("Enter elements in array :");
                for(int i = 0; i<arr.length; i++){
                        arr[i] = sc.nextInt();
                }

		System.out.println("Enter Index :");
                int index = sc.nextInt();
		int ans[] = RemoveElement.removeAtIndex(arr, size, index);

		for(int i = 0; i<ans.length; i++){
                        System.out.print(ans[i] + " ");
                }
	}
	
	static int[] removeAtIndex(int arr[], int n, int r){
		int ans[]= new int[n-1];
		for(int i = 0; i < n-1; i++){
			if(i >= r){
				ans[i] = arr[i+1];
			}else{
				ans[i] = arr[i];
			}
		}
		return ans;
	}
}
