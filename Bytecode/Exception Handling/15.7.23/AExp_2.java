/*
class Demo{
	public static void main(String[] args){
		System.out.println("Start main");
		
		try{
			System.out.println(10/0);			//Risky Code
									//new ArithmeticException();
		}
		catch(ArithmeticException obj){				//ArithmeticException obj=new ArithmeticException();
			System.out.println("Exception Occured");	//Handling code
		}

		System.out.println("End main");
	}
}
*/


// Bad Programming Practice
/*
class Demo{
        public static void main(String[] args){
                System.out.println("Start main");

                try{
                        System.out.println(10/0);                       //Risky Code
                                                                        //new ArithmeticException();
                }
                catch(Throwable obj){                        		//Throwable obj=new ArithmeticException();
                        System.out.println("Exception Occured");        //Handling code
                }

                System.out.println("End main");
        }
}
*/

class Demo{
        public static void main(String[] args){
                System.out.println("Start main");

                try{
                        System.out.println(10/0);                       //Risky Code
                                                                        //new ArithmeticException();
                }
                catch(Object obj){                                  	//error: incompatible types: Object cannot be converted to Throwable.
                        System.out.println("Exception Occured");        //Handling code
                }

                System.out.println("End main");
        }
}


