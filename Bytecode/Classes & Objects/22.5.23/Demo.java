
class Demo{
	int x=10;
	static int y=20;
	void fun1(){
		System.out.println(x);
		System.out.println(y);
	}
	static void fun2(){
		System.out.println(y);
	}
}

class Client{
	public static void main(String[] args){
	 	//fun1(); error:cannot find symbol
		//fun2(); error:cannot find symbol

		//Demo.fun1();  error: non-static method fun1() cannot be referenced from a static contex
		Demo.fun2();

		Demo obj=new Demo();
		obj.fun1();
		obj.fun2();
	}
}
/*
class Demo{
        private int x=10;
        private static int y=20;
        private void fun1(){
                System.out.println(x);
                System.out.println(y);
        }
        private static void fun2(){
                System.out.println(y);
        }
}

class Client{
        public static void main(String[] args){
                Demo obj=new Demo();
                obj.fun1();//error:fun1() has private access in Demo.
		obj.fun2();//error:fun1() has private access in Demo.
        }
}
*/
