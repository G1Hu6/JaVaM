class ErrDemo{
	public static void main(String[]l){
		ErrDemo n=new ErrDemo();
		n.fun(10);//10.0
		n.fun(10.4f);//10.4
		n.fun('A');//65.0
		n.fun(true);//incompatible types: boolean cannot be converted to float
		n.fun(10.9);//error: incompatible types: possible lossy conversion from double to float
	}
	
	void fun(float x){
		System.out.println(x);	
	}
}
