/*
class RecDemo1{

	static void funRec(int num){
	
		if(num == 0)
			return;
		funRec(num);
	}

	public static void main(String[] args){
	
		funRec(5);
	}
}

// Exception in thread "main" java.lang.StackOverflowError
*/

/*
class RecDemo1{

        static void funRec(int num){

                if(num == 0)
                        return;
		System.out.println(num);
                funRec(num);
        }

        public static void main(String[] args){

                funRec(5);
        }
}

*/

// Tail Recursion

class RecDemo1{

	static void tailRec(int num){
	
		if(num == 0)
			return;
		System.out.println(num);
		tailRec(--num);
	}

	static void nontailRec(int num){
	
		 if(num == 0)
                        return;
		nontailRec(--num);
                System.out.println(num);
	}

	public static void main(String[] args){
	
		tailRec(10);
		nontailRec(10);
	}
}
