interface Demo1{
        void gun();

        void fun();
}
abstract class Child implements Demo1{
        public void gun(){
		System.out.println("In gun");
        }
}
class Demochild implements Child{
	public void fun(){
	
	}
}
class Client{
	public static void main(String[] args){
		Demo1 obj=new Child();
		obj.fun();
		obj.gun();
	}
}

