// Method Hiding :when both the methods having static modifier then this conceptis called as method hiding not as Overriding.
class Parent{
	static void fun(){
		System.out.println("In fun Parent");
	}
}
class Child extends Parent{
	static void fun(){
		System.out.println("In fun Child");
	}
}
class Client{
	public static void main(String[] args){
		Parent obj =new Child();
		obj.fun();	//In fun Parent 
		
		Parent obj1=new Parent();
		obj1.fun();	//In fun Parent 
		
		Child obj2=new Child();
		obj2.fun();	//In fun Child
	}
}

