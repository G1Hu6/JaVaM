interface Demo1{
        void gun();

        void fun();
}
class Child implements Demo1{
        public void gun(){
		System.out.println("In gun");
        }
        public void fun(){
		System.out.println("In gun");
        }
}
class Client{
	public static void main(String[] args){
		//Demo1 obj=new Demo1();
		//Demo1 is abstract; cannot be instantiated.
		
		Demo1 obj=new Child();
		obj.fun();
		obj.gun();
	}
}

