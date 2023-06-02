class Parent{
	int x=40;

	Parent(){
		System.out.println("In Parent Constructor");
		
		System.out.println(x);
		//System.out.println(this.x);
	}

	void access(){
		System.out.println("Parent Instance");
	}
}
class Child extends Parent{
	int y=90;

	Child(){
		System.out.println("In Parent Constructor");

                System.out.println(x);
		//System.out.println(this.x);
		
		System.out.println(y);
		//System.out.println(this.y);

		access(); //Bad practice.
	}
}

class Client{
	public static void main(String[] args){
		Child obj=new Child();
		//obj.access();
	}
}
