// Generally throws keyword is used to declear CompileTime Exception.

class Demo{
	public static void main(String[] args)throws ArithmeticException{
		System.out.println("Start main");
		System.out.println(10/0);
		System.out.println("End main");
	}
}
/*
start main
exception in thread "main" java.lang.ArithmeticException: / by zero
	at Demo.main(AExp_1.java:4)
*/
