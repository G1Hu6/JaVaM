class Outer{
	int a=10;
	static int b=20;
	
	class Inner{
		int x=11;
		//static int y=50;
		static final int y=50;
	}

	public static void main(String[] args){
		System.out.println(b);	//20
		//System.out.println(a);			//error: non-static variable a cannot be referenced from a static context
		System.out.println(Outer.b); //20

		Outer obj=new Outer();
		System.out.println(obj.a); //10
		System.out.println(obj.b); //20

		Outer.Inner obj1=obj.new Inner();
		System.out.println(obj1.x); //11
		System.out.println(obj1.y); //50
		
	       //Inner obj2=new Inner();				//error: non-static variable this cannot be referenced from a static context 

		Inner obj2=obj.new Inner();
		System.out.println(obj2.x); //11
                System.out.println(obj2.y); //50

		System.out.println(Inner.y); //50 
		System.out.println(Outer.Inner.y); //50

		//System.out.println(new Inner().x);			//error: non-static variable this cannot be referenced from a static context 
		//System.out.println(new Inner().y);			//error: non-static variable this cannot be referenced from a static context 

		//System.out.println(Outer.new Inner().x);		// error: cannot find symbol(Outer)

		System.out.println(obj.new Inner().x);
		System.out.println(obj.new Inner().y);

		System.out.println(new Outer().new Inner().x);
	}
}
