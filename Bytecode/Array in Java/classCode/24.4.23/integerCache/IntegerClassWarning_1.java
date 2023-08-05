class IntegerCacheWarning{
	//Integer a=new Integer(10);
	//Float a=new Float(10);
	//Charactor a=new Charactor('L');	//No Wrapper class as Char.
	public static void main(String[]pp){
		int x=10;
		int y=20;
		Integer z=30;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		System.out.println(a);
	}
}
/*
code1.java:2: warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
	Integer a=new Integer(10);
	          ^
code1.java:10: error: non-static variable a cannot be referenced from a static context
		System.out.println(a);
		                   ^
1 error
1 warning
error: compilation failed

*/
