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
	public static void main(String[] args){
		Outer obj1=new Outer();
		obj1.gun();	//In fun-Inner
		//obj1.fun();	//error:cannot find symbol
	

		//Inner obj2=new Inner();
		//error: cannot find symbol
		//error: cannot find symbol

		//Outer.Inner obj2=new Inner();		//error: cannot find symbol
		
		//obj1.Inner obj3=obj1.new Inner();	//error: package obj1 does not exit.
		
		Outer.Inner obj2=obj1.new Inner();
		Outer.Inner obj5=new Outer().new Inner();

		//Outer.Inner obj4=new Inner().new Outer();
		obj2.fun();	//In fun-Outer

		
	}
}
