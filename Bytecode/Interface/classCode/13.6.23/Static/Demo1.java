interface Demo1{
	static void fun(){
		System.out.println("In Fun-Demo1");
	}
}
class Demo1Child implements Demo1{
	//In Interface Static methodes cannot come to its child class.
	//We cannot accect static methodes through object.(only with interface name i.e.Reference )
}
class Client{
	public static void main(String[] args){
		Demo1Child obj1=new Demo1Child();
		//In Interface Static methodes cannot come to its child class.
		//obj1.fun();	//cannot find symbol
		
		Demo1 obj2=new Demo1Child();
		//obj2.fun();	//error:illegal static interface method call

		Demo1.fun()	//In Fun-Demo1
		
		//Demo1Child.fun();  //cannot find symbol


	}
}
