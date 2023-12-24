class SumOfDigits{

	static int sum = 0;
	static void printSumOfDigitsRec(int num){
	
		if(num == 0)
			return;
		sum = sum + num % 10;
		num = num / 10;
		printSumOfDigitsRec(num);
	}

	static int printSumOfDigitsRec1(int num){
		
		if(num == 0)
			return 0;
		return num%10 + printSumOfDigitsRec1(num/10);
	}
	public static void main(String[] args){
	
		printSumOfDigitsRec(1239);
		System.out.println(sum);

		System.out.println(printSumOfDigitsRec1(1239));
	}
}
