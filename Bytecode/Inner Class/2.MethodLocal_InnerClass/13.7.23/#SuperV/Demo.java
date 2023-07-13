class Outer{
	Object fun(){
		System.out.println("In Outer Fun");
		class Inner{
			static void fun(){
				System.out.println("In Inner Fun");
			}
		}
		return this;
	}
	void gun(){
		System.out.println("In Outer gun");
	}
}
class Client{
	public static void main(String[] args){
		Outer obj=new Outer();
		obj.fun().fun();
		//System.out.println(new Outer.Inner.fun());
	}
}
