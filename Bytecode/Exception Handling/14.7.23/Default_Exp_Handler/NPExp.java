class Demo{
	void m1(){
		System.out.println("in m1");
	}
	void m2(){
                System.out.println("in m2");
        }
	public static void main(String[] args){
		System.out.println("start main");
		Demo obj=new Demo();
		obj.m1();

		obj=null;
		obj.m2();

		System.out.println("end main");
	}
}
/*
Java Version 11:

start main
in m1
Exception in thread "main" java.lang.NullPointerException
	at Demo.main(NPExp.java:14)
--------------------------------------------------------------------------------
Java Version 17 and above:
       
start main
in m1
Exception in thread "main" java.lang.NullPointerException: Cannot invoke "Demo.m2()" because "<local1>" is null
	at Demo.main(NPExp.java:14)
 */
