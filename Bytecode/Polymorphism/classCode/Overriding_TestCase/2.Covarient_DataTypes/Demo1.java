// Covarient Datatype: two datatpes having Parent Child releation.
class Parent{
	Object fun(){
		//Object obj1=new Object();
		//return obj1;

		return new Object();
	}
}
class Child extends Parent{
	String fun(){
		//return new String();	
		return "King";
	}
}
class Client{
	public static void main(String[] args){
		Parent obj=new Child();
		obj.fun();
		System.out.println(obj.fun());
	}
}

