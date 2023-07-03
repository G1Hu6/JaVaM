abstract class Demo1{
        void carrer(){
                System.out.println("Doctor");
        }

        abstract void marry();
}
class Child extends Demo1{                
	void marry(){
		System.out.println("Kriti Sanon");
	}
}
class Client{
	public static void main(String[] args){
		Demo1 obj=new Child();
		obj.marry();
		obj.carrer();

		Child obj1=new Child();
                obj1.marry();
                obj1.carrer();

		//Demo1 obj=new Demo1();	//Error.
	}
}

