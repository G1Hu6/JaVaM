class ArrPassDemo1{
	public static void main(String[] args){
		fun(10,20.5);
		fun('A',20);//no data loss here
	}
	//static void fun(){
		//error: method fun in class ArrPassDemo1 cannot be applied to given types;	
	//}
	
	static void fun(int x,double y){
		System.out.println(x);
		System.out.println(y);
	}
}
