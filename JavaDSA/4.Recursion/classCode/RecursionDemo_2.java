/*
class RecDemo2{

	void fun(int num){
	
		if(num == 0)
			return;
		//num = 5 + fun(--num);		// Error: 'void' type not allowed here
		System.out.println(num);
	}

	public static void main(String[] args){
	
		System.out.println("Start main");
		fun(10);
		System.out.println("End main");
	}
}


class RecDemo2{

        static int fun(int num){

                if(num == 0)
                        return 1;
                num = 5 + fun(--num);         
                System.out.println(num);
        }					// Error: missing return statement

        public static void main(String[] args){

                System.out.println("Start main");
                fun(10);
                System.out.println("End main");
        }
}
*/

class RecDemo2{

        static int fun(int num){

                if(num == 0)
                        return 1;
                
		return 5 + fun(--num);
                //System.out.println(num);
        }                                     

        public static void main(String[] args){

                System.out.println("Start main");
                int ret = fun(2);
		System.out.println(ret);	//11
                System.out.println("End main");
        }
}

