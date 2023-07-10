interface Demo1{
	void fun();
}
interface Demo2{
	void fun();
}
class DemoChild implements Demo1{
	public void fun(){
		Demo1 obj1=new DemoChild();
		obj1.fun();

		Demo2 obj1=new DemoChild();
		obj2.fun();
	}	
}
