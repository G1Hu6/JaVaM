class Outer{
	class Inner{
		void fun(){
			System.out.println("In fun-Outer");
		}
	}
	void gun(){
                        System.out.println("In gun-Inner");
                }
}
class Client{
	Outer obj1=new Outer();
	//obj1.gun();
	//obj1.fun();	//error:cannot find symbol
	

	Inner obj2=new Inner();
	/*
	 Demo1.java:17: error: cannot find symbol
	Inner obj2=new Inner();
	^
  symbol:   class Inner
  location: class Client
Demo1.java:17: error: cannot find symbol
	Inner obj2=new Inner();
	               ^
  symbol:   class Inner
  location: class Client
2 errors

	 */
	Outer.Inner obj2=new Inner();
	/*
	 Demo1.java:32: error: cannot find symbol
	Outer.Inner obj2=new Inner();
	                     ^
  symbol:   class Inner
  location: class Client

	 */
	Outer.Inner obj2=obj1.new Inner();
	obj2.fun();
}
