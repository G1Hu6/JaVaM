class MethoDemo{
	int x=10;
	static int y=20;
	public static void main(String[] o){
		//fun();//non-static method fun() cannot be referenced from a static context
		gun();
	       //System.out.println(x);error: non-static variable x cannot be referenced from a static context
		System.out.println(y);
	}
	void fun(){
		System.out.println("In Fun.....");
	}
	static void gun(){
		System.out.println("In Gun.....");
	}
}
