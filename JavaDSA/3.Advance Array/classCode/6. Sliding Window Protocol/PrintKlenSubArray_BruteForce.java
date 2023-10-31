class FindCountOfklenSubArray{
	public static void main(String[] args){
		int arr[] = new int[]{-3, 4, -2, 5, 3, -2, 8, 2, 1, 4};
		int k = 4;

		int count = 0;
		int end = k-1;
		int start = 0;

		while(end < arr.length){

			for(int i = start; i <= end; i++){
				System.out.print(arr[i] + " ");
			}
			start++;
			end++;
			System.out.println();
		}
	}
}
