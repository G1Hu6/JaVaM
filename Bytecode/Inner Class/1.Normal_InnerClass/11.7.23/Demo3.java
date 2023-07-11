class Outer{
	int a=10;
	static int b=20;
	
	class Inner{
		int x=11;
		//static int y=50;
		final static int y=50;
	}
}
class Client{
	public static void main(String[] args){
		System.out.println(Outer.b);
		Outer obj=new Outer();
		System.out.println(obj.b);

		Outer.Inner obj1=obj.new Inner();
		System.out.println(obj1.x);

		//System.out.println(Outer.Inner.y);
		//System.out.println(new Outer().Inner.y);	//unexpected type
		System.out.println(new Outer().new Inner().y);
		System.out.println(Outer.
	}
}
