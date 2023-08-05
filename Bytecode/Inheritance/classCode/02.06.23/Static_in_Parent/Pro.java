class Parent{
	int x=10;
        static int y=10;
        static{
               System.out.println("In Parent static Block");
        }
	
	Parent(){
		System.out.println("In Parent Constructor");
	}
	void method1() {
		System.out.println(x);
		System.out.println(y);
	}
	static void method2(){
		System.out.println(y);
	}
}
class Child extends Parent{
        static{
                System.out.println("In Child static Block");
        }
	Child(){
		 System.out.println("In Child Constructor");
	}
}
class Client{
        public static void main(String[] args){
	     
             Child obj=new Child();
	     obj.method1();
	     obj.method2();
        }
}

