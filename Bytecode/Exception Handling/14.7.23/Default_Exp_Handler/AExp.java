class Demo{
	void m1(){
		System.out.println("In m1");
		System.out.println(10/0);
		m2();
	}
	void m2(){
		System.out.println("In m2");
	}
	public static void main(String[] args){
		Demo obj=new Demo();
		obj.m1();
	}
}
/*
 .7.23/Default_Exp_Handler$ java Demo 
In m1
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at Demo.m1(AExp.java:4)
	at Demo.main(AExp.java:12)

 */
