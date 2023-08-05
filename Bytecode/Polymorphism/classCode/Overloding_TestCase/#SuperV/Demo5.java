//If ambiguity arrises between Parent Child realeation in parameters then Parent class give more preference to Child class.
class Demo5{
	void fun(Object obj){
		System.out.println("Object");
	}
	void fun(String str){
                System.out.println("String");
        }
}
class Client{
	public static void main(String[] args){
		Demo5 obj =new Demo5();
		obj.fun("C2W");
		obj.fun(11);
		obj.fun(null);		//Ambigity
	}
}
