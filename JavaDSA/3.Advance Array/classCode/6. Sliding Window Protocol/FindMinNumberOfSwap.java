/*
class MinNumberOfSwap{
	public static void main(String[] args){
		int arr[] = new int[]{1, 12, 10, 14, 3, 10, 5};
		int b = 8;

		int k = 0;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] <= b){
				k++;
			}
		}

		int minSwap = Integer.MAX_VALUE;
		int start = 0;
		int end = k-1;
		while(end < arr.length){
			int swapCount = 0;
			for(int i = start; i <= end; i++){
				if(arr[i] > b){
					swapCount++;
				}
			}

			if(swapCount < minSwap){
				minSwap = swapCount;
			}
			start++;
			end++;
		}

		System.out.println(minSwap);
	}
}
*/

class MinNumberOfSwap{
	public static void main(String[] args){
		int arr[] = new int[]{1, 12, 10, 14, 3, 10, 5};
		int b = 8;

		int swapCount = 0;
		int k = 0;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] <= b){
				k++;
			}
		}

		int start = 0;
		int end = k-1;

		for(int i = 0; i <= end; i++){
			if(arr[i] > b){
           	                swapCount++;
                        }
		}

		int minSwap = swapCount;
		start = 1;
		end = k;
		while(end < arr.length){
			if(arr[start-1] > b)
				swapCount--;
			if(arr[end] > b)
				swapCount++;

			if(swapCount < minSwap){
				minSwap = swapCount;
			}
			start++;
			end++;
		}

		System.out.println(minSwap);
	}
}
