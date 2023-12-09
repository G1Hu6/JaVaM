// WAP to print the numbers between 1 to 10.

class PrintNumbers{
	// Using For Loop
	void printNum(int num){
		for(int i = 1; i <= num; i++){
			System.out.print(num + " ");
		}
	}

	//Using Recursion
	static void printNumRec(int num){
		if(num == 0){
			return;
		}
		printNumRec(num-1);
		System.out.print(num + " ");
	}

	public static void main(String[] args){
		printNumRec(10);		
	}
}
