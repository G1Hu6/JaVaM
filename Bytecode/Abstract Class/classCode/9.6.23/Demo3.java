/*
abstract class Demo1{					// Error Removed.
        void carrer(){
                System.out.println("Doctor");
        }

        abstract void marry();     
}
*/


abstract class Demo1{                            
        void carrer(){
                System.out.println("Doctor");
        }

        abstract void marry();
}
class Client{
	public static void main(String[] args){
		Demo1 obj=new Demo1();		//Demo1 is abstract; cannot be instantiated
	}
}
