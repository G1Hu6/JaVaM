/*
 Q(1). Given an array of size N. find total number of possible subarrays ?

       Arr: [4, 2, 10, 3, 12, -2, 15]

 */


// Time Complexity = O(N^2)
// Space Complexity = O(1)

class CountSubArray{
	public static void main(String[] args){
		int arr[] = new int[]{4, 2, 10, 3, 12, -2, 15};

		int count = 0;
		for(int i = 0; i < arr.length; i++){
			for(int j = i; j < arr.length; j++){
				count++;
			}
		}
		System.out.println(count);
	}
}
