import java.lang.annotation.*;

class Parent{
	@Deprecated
	void m1(){
		System.out.println("Parent-m1");
	}
	Integer i = new Integer(10);
}

class Client{
	//@SuppressWarnings("hi")
	public static void main(String[] args){
		Parent p = new Parent();
		Integer i = new Integer(10);
		p.m1();
	}
}
