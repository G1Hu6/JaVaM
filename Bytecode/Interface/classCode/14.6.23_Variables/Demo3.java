// According to Protocall the variable decleared by interface is printed with the help of its Reference.

interface A{
	int x=10;
	void fun();
}

interface B{
        int x=40;
        void fun();
}

class Child implements A,B{

	int x=90;
	public void fun(){
	
		System.out.println(x);
		System.out.println(A.x);
		System.out.println(B.x);
		
	}
}
class Client{
	public static void main(String[] args){
		Child o=new Child();
		o.fun();
	}
}
