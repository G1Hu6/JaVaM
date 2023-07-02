class Demo2{
	void fun(int x,float y){
		System.out.println("Int-Float");
	}
	void fun(float x,int y){
		System.out.println("Float-Int");
	}
}
class Client{
	public static void main(String[] args){
		Demo2 obj=new Demo2();
		obj.fun(10,10);
	}
}
/*
 error: reference to fun is ambiguous
 	both method fun(int,float) in Demo2 and method fun(float,int) in Demo2 match
 */
