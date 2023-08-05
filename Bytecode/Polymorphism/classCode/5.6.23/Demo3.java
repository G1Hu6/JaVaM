class Parent{
	Parent(){
		System.out.println("In Parent Constructor");
	}
	void fun(){
		System.out.println("In fun");
	}
}
class Child extends Parent{
        Child(){
                System.out.println("In Child Constructor");
        }
        void gun(){
                System.out.println("In gun");
        }
}
class Client{
	public static void main(String[] args){
		
		Object obj=new Parent();
		Object obj1=new Child();
		Parent obj2=new Child();
                
		//Child obj3=new Parent();	//error: incompatible types: Parent cannot be converted to Child
	}
}
