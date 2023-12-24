class PrintNum1To10{

	static void printNum(int num){
	
		for(int i = 1; i <= num ;i++){
		
			System.out.print(i + " ");
		}
		System.out.println();
	}

/*
	static void printNumRec(int num){
	
		if(num == 0){	// Base condition
			System.out.println();
			return;
		}

		System.out.print(num + " ");
		num--;
		printNumRec(num);
	}
*/
	static void printNumRec(int num){
	
		if(num == 0){

			return;
		}

		printNumRec(num-1);
		System.out.print(num + " ");
	}

	public static void main(String[] args){
	
		printNum(10);
		printNumRec(10);

	}
}
