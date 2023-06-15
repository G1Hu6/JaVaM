interface Demo2{
	int x=10;
	void fun();
}
class Demo2Child implements Demo2{

	//int y=x;
	//int x=40;	instance variable so get bypush in its constructor
	public void fun(){
		//x=20;//error: cannot assign a value to final variable x
		System.out.println(x);
		System.out.println(x);
		System.out.println(Demo.x);
		//all the lines get bypush seperately
	}
}
