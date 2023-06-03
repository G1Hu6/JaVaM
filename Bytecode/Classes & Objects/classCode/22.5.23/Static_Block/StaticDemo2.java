class StaticDemo2{
	int x=10;
	static int y=20;
	
	static{
		System.out.println("In Static Block 1");
	}

	public static void main(String[] args){
		System.out.println("In Main ....");
		StaticDemo2 obj=new StaticDemo2();
		System.out.println(obj.x);
	}

	static{
		System.out.println("In Static Block 2");
		//System.out.println(x);  error:non-static variable x cannot be referenced from static context
		System.out.println(y);
	}
}
