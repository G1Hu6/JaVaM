//Object class can work with all class because it Parent of all classes.

class Demo4{
	Object arr[]={1,22.3,77.98f,'S',"ugjugjbmjg"};
	void fun(Object obj){
		System.out.println("Object");
	}
}
class Client{
	public static void main(String[] args){
		Demo4 obj=new Demo4();
		obj.fun("King");
	}
}
