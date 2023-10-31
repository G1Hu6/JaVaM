class FindCountOfklenSubArray{
	public static void main(String[] args){
		int arr[] = new int[]{-3, 4, -2, 5, 3, -2, 8, 2, 1, 4};
		int k = 4;

		int count = 0;

		for(int i = 0; i < arr.length; i++){
			if(i+k-1 < arr.length){
				count++;
			}else{
				break;
			}
		}

		/*
		 int end = k-1;
		 int count = 0;
		 while(end < arr.length){
		 	count++;

			end++;
		 }
		 */
		System.out.println("Count of " + k + " len SubArray =" +count);
	}
}
