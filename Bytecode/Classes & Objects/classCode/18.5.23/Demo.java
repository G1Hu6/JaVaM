class Demo{
	int x=10;
	private int y=20;
	void fun(){
		System.out.println(x);
		System.out.println(y);
	}
}
class MainDemo{
	public static void main(String[] args){
		Demo obj=new Demo();
		obj.fun();

		System.out.println(obj.x);
		//System.out.println(obj.y);  error:y has private access in Demo.
		
		//System.out.println(x);      error:can not find symbol.
		//System.out.println(y);      error:can not find symbol.
	}
}
