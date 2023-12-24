class SumOfN{

	static void printSum(int num){
		
		/*
		int sum = 0;
		for(int i = 1; i <= num; i++){
		
			sum = sum + i;
		}
		System.out.println(sum);
		*/

		System.out.println(num*(num+1)/2);
	}
	
	static int sum = 0;
	static void printSumRec(int num){
		
		if(num == 0)
			return;
		sum = sum + num;
		num--;
		printSumRec(num);

	}

	public static void main(String[] args){
	
		printSum(10);
		printSumRec(10);
		System.out.println(sum);
	}

}
