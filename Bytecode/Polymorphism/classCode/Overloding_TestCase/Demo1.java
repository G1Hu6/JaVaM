/*
class Demo1{
	void fun(int a){
		System.out.println("Int Para");
	}
	void fun(char x){
		System.out.println("Char Para");
	}
}
class Client{
	public static void main(String[] args){
		Demo1 obj=new Demo1();
		obj.fun('A');
		obj.fun(12);
	}
}
*/
class Demo1{
        void fun(float a){
                System.out.println("Int Para");
        }
        void fun(char x){
                System.out.println("Char Para");
        }
}
class Client{
        public static void main(String[] args){
                Demo1 obj=new Demo1();
                obj.fun('A');
                obj.fun(12);
        }
}

