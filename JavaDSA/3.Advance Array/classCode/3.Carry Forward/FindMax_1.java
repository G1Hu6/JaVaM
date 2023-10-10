class ArrayMaxUpTo_i{
	public static void main(String[] args){
		int arr[] = new int[]{-3, 6, 2, 4, 5, 2, 8, -9, 3, 1};
		int N = 10;
		int j = 3;

		int max = Integer.MIN_VALUE;
		for(int i = 0; i < j; i++){
			if(arr[i] > max)
				max = arr[i];
		}
		System.out.println(max);
	}
}
