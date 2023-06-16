class Outer{		//Outer.class
	void fun(){
		System.out.println("In Fun-Outer");

		class Inner{		//'Outer$1Inner.class'
			void fun(){
				System.out.println("In Fun-Inner");
			}
			//Inner obj=new Inner();
			//obj.fun();	error: <identifier> expected
		}
		//Inner obj=new Inner();
		//obj.fun();

	}

	void gun(){
		System.out.println("In Gun-Outer");
	}
}

class Client{
	public static void main(String[] args){
		Outer obj1=new Outer();
		obj1.fun();	//Here we can't access Inner class Because object is not created
				//There is only way that we have to make object inside inner class.
		obj1.gun();
	}
}
