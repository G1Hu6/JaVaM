class Outer{
	void m1(){
		System.out.println("In m1-Outer");
	}
	static class Inner{
		void m1(){
			System.out.println("In m1-Inner");
		}
	}
}

class Client{
	public static void main(String[] args){
		//Inner obj=new Inner();		//2 error:cannot find symbol
		
		//Outer.Inner obj=new Inner(); 		//1 error:cannot find symbol
		
		//Outer.Inner obj=new Outer().new Inner();//error: qualified new of static class
		
		//Outer.Inner obj=this$0.new Inner();

		//Outer.Inner obj=Outer.new Inner();

		Outer.Inner obj=new Outer.Inner();
		obj.m1();

	}
}
