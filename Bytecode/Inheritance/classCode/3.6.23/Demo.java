class Parent{
	int x=10;
	static int y=20;
	Parent(){
		System.out.println("Parent");
		System.out.println(super.hashCode());
	}
}
class Child extends Parent{
	int x=100;
	static int y=200;
	Child(){
		System.out.println("Child");
	}
	void access(){
		System.out.println(super.x);      //Parent.x
		System.out.println(super.y);      //Parent.y
		//System.out.println(super);      // error: '.' expected
		System.out.println(x);
		//System.out.println(Parent.x);   //non-static variable x cannot be referenced from a static context
		//System.out.println(Parent);     //error:cannot find symbol 
		System.out.println(Parent.x);
		System.out.println(y);
		System.out.println(this.hashCode());
		System.out.println(super.hashCode());
		//System.out.println(super.clone());

	}
}
class Client{
	public static void main(String[] args){
		Child obj=new Child();
		obj.access();
		//System.out.println(super);
		//System.out.println(super.clone());
	}
}
