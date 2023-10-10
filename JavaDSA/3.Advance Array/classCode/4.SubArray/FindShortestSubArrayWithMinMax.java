import java.util.*;
class Demo{
	static int findLength(int arr[], int n){
		int minValue = Integer.MAX_VALUE;
		int maxValue = Integer.MIN_VALUE;
		for(int i = 0; i < n; i++){
			if(arr[i] > maxValue){
				maxValue = arr[i];
			}
			if(arr[i] < minValue){
				minValue = arr[i];
			}
		}

		int minLen = Integer.MAX_VALUE;
		int ans = 0;
		for(int i = 0; i < n; i++){
			if(arr[i] == minValue){
				for(int j = i+1; j < n; j++){
				   	if(arr[j]== maxValue){
						ans = j-i+1;
						if(minLen > ans){
							minLen = ans;
						}
					}
				}
			}else if(arr[i] == maxValue){
				for(int j = i+1; j < n; j++){
                                     	if(arr[j]== minValue){
                                                ans = j-i+1;
                                                if(minLen > ans){
                                                        minLen = ans;
                                                }
                                        }
                                }
			}
		}
		return minLen;
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

		System.out.println("Count = " + findLength(arr, size));
	}	
}
