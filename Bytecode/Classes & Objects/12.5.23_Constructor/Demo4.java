class Demo4{
	Demo4(){
		System.out.println("Inside RCB");
	}

	void fun(){
		Demo4 obj=new Demo4();
		System.out.println("Object ="+ obj);
		System.out.println(System.identityHashCode(obj));
	}
	public static void main(String[] args){
		Demo4 obj1=new Demo4();
		System.out.println("Object 1 ="+obj1);
		System.out.println(System.identityHashCode(obj1));

		Demo4 obj2=new Demo4();
		System.out.println("Object 2 ="+obj2);
		 System.out.println(System.identityHashCode(obj2));
		System.out.println("Object 1 ="+obj1);

		obj1.fun();
	}
}
