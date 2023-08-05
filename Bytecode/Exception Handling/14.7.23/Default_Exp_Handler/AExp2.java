class Demo{
	void m2(){
		System.out.println("start m2");
		System.out.println(10/0);
		System.out.println("end m2");
	}
	void m1(){
		System.out.println("start m1");
                m2();
                System.out.println("end m1");
	}
	public static void main(String[] args){
		Demo obj=new Demo();
		obj.m1();
	}
}
/*
start m1
start m2
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at Demo.m2(AExp2.java:4)
	at Demo.m1(AExp2.java:9)
	at Demo.main(AExp2.java:14)

 */
