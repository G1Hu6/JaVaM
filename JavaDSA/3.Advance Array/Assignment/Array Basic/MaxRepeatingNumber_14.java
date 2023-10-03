import java.util.*;
class ArrayB14{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter size of Array :");
                int size = sc.nextInt();

                int arr[] = new int[size];
                System.out.println("Enter elements in array :");
                for(int i = 0; i<arr.length; i++){
                        arr[i] = sc.nextInt();
                }

		System.out.println("Enter range :");
                int k = sc.nextInt();

		System.out.println("Max Repeating :");
		System.out.println(ArrayB14.maximumRepeating(arr, size, k));
	}

	static int maximumRepeating(int arr[], int n, int k){
		TreeSet ts = new TreeSet();
		int max = Integer.MIN_VALUE;
		int ans = -1;
		for(int i = 0;i < k; i++){
			int count = 0;
			int j,v = 0;
			for(j = 0;j < n; j++){
				if(arr[j] == i){
					ts.add(arr[j]);
					 v = count++;
				}
			}
			max = v;
			if(v > max){
				ans = i;
			}else if(v == max){
				System.out.println(ts);
				try{
					ans =(int)ts.first();
				}catch(NullPointerException in){
				
				}
			}else{
				ts.remove(i);
			}
		}
		return ans;
	}
}
