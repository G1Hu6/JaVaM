//We cannot access interface default method which is overrided in Child class 

interface Demo4{
	default void fun(){
		System.out.println("In Fun-Demo4");
	}
}

class Demo4Child implements Demo4{

	Demo4Child(){
		//super();  	//invokespecial call the object class constructor because interface Demo4 Don't have its constructor.
	}

	public void fun(){
		super.fun();
		Demo4.fun();
		System.out.println("In Fun-Demo4Child");
	}
}

class Client{
	public static void main(String[] args){
		//Demo4Child obj1=new Demo4Child();
		//obj1.fun();				//except this

		Demo4 obj2=new Demo4Child();
		Demo4.fun();
	}
}
