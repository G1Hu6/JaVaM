/*
class ConstDemo{
	ConstDemo(){
		System.out.println("In Constructor");
	}
	public static void main(String[] args){
		ConstDemo obj1=new ConstDemo();
		ConstDemo obj2=new ConstDemo();
	}
}
*/

class ConstDemo{
	int x=10;
        ConstDemo(){
                System.out.println("In Constructor");
        }

	void fun(){
		System.out.println(x);
	}
        public static void main(String[] args){
                ConstDemo obj1=new ConstDemo();
                obj1.fun();
        }
}

