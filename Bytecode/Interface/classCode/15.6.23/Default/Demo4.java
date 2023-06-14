interface Demo4{
	void gun();

	default void fun(){
		System.out.println("In Fun-Demo4");
	}
}

class Demo4Child implements Demo4{
	public void gun(){
		System.out.println("In Gun-Demo4Child");
	}
}

class Client{
	public static void main(String[] args){
		Demo4Child obj1=new Demo4Child();
		obj1.fun();	//In Fun-Demo4
		obj1.gun();	//In Gun-Demo4Child

		Demo4 obj2=new Demo4Child();
		obj2.gun();	//In Gun-Demo4Child
		obj2.fun();	//In Fun-Demo4
	}
}
