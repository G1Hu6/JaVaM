/*
final class Demo5{
	void fun(){
		System.out.println("In final-fun Parent");
	}	
}

class Demo5Child extends Demo5{//error: we cannot inherit from final Demo5
	void fun(){
	
	}
}
*/

class Demo5{
        void fun(){
                System.out.println("In fun Parent");
        }
}

final class Demo5Child extends Demo5{//error: we cannot inherit from final Demo5
        void fun(){
		System.out.println("In fun final-Dmo5Child");
        }
}
class Client{
	public static void main(String[] args){
		Demo5 obj=new Demo5Child();
		obj.fun();
	}
}
