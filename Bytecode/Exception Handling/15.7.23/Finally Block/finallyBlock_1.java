class Demo{
	void m1(){
		System.out.println("In m1");
	}
	void m2(){
		System.out.println("In m2");
	}
	public static void main(String[] args){
		Demo obj=new Demo();
		obj.m1();
		obj=null;
		obj.m2();
	}
}
/*
 *Finally Block$ java Demo
In m1
Exception in thread "main" java.lang.NullPointerException
	at Demo.main(finallyBlock_1.java:12)

 */
