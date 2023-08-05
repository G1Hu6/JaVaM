class Parent{
	static void fun(){
		System.out.println("In Fun Parent");
	}
}
class Child extends Parent{
	
}
class Client{
	public static void main(String[] args){
		Parent obj=new Child();
		obj.fun();		//No Error	//In Fun Parent
	}
}
