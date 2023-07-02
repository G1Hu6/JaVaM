class Demo3{
	void fun(String str1){
		System.out.println("String");
	}
	void fun(StringBuffer str2){
		System.out.println("StringBuffer");
	}
}
class Client{
	public static void main(String[] args){
		Demo3 obj=new Demo3();
		
		obj.fun("Core2Web");
		//String str1="Core2Web";
		//StringBuffer str2="Core2Web";			//No match

		obj.fun(new StringBuffer("Core2Web"));
		//String str1=new StringBuffer("Core2Web");	//No match
                //StringBuffer str2=new StringBuffer("Core2Web");

       		obj.fun(null);
		//error: reference to fun is ambiguous
                //both method fun(String) in Demo3 and method fun(StringBuffer) in Demo3 match		
	}
}
