class DemoProof{
	DemoProof(){
		System.out.println("In Constructor...");
		System.out.println(this);
	}
	void fun(){
		System.out.println(this);
	}
	public static void main(String[] args){
		//System.out.println(this);//   non-static variable this cannot be referenced from a static context

		DemoProof o=new DemoProof();
		 System.out.println(o);
		o.fun();
	}
}
