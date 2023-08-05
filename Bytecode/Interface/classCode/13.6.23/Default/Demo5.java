interface Demo5{

        default void fun(){
                System.out.println("In Fun-Demo5");
        }
}

class Demo5Child implements Demo5{
        void gun(){
                System.out.println("In Gun-Demo5Child");
	}
	void fun(){
		System.out.println("In Fun-Demo5Child");
	}
}

//error: fun() in DemoChild5 cannot implements fun() in Demo5
//	void fun()
//	     ^
//	attempting to assign weaker access privileges; was public



/*
class Client{
        public static void main(String[] args){
                Demo5Child obj1=new Demo5Child();

		Demo5 obj2=new Demo5Child();	
		//obj2.gun();     //error: cannot find symbol    
                obj2.fun();
        }
}
*/

