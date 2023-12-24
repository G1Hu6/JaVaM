class ArrayRec{
	
	static int findElement(int arr[], int num){
	
		int ans = -1;
		for(int i = 0; i < arr.length; i++){
		
			if(arr[i] == num){
				ans = i;
				return ans;	
			}
		}
		return ans;
	}

	static void findElementRec(int arr[], int num){
	
		if(num < 0)
			return -1;
		arr[num-1]

	}
	public static void main(String[] args){
		
		int arr[] = {10, 20, 30};
		System.out.println(findElement(arr, 40));
	}
}
