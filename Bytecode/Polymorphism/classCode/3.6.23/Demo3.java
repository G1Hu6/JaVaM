/*   Method Overloding   */
 
class Demo1{
        void fun(int x){        //fun(int)      Method Signature
		System.out.println(x);
        }
        void fun(long y){        //fun(long)
		System.out.println(y);
        }

	void fun(Demo1 obj){
		System.out.println("In Demo1 Para");
		System.out.println(obj);
	}

	public static void main(String[] args){
		Demo1 obj=new Demo1();
		obj.fun(10);
		obj.fun('A');
		//obj.fun(22.99f);

		Demo1 obj1=new Demo1();
		obj1.fun(obj);
	}
}

