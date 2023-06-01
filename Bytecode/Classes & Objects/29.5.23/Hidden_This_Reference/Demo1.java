class Demo1{
	int x=10;

	Demo1(){         //Demo(Demo this)
		System.out.println("In No-Args Constructor");
	}

	Demo1(int x){    //Demo(Demo this , int x)
		System.out.println("In Para Constructor");
	}
	
	public static void main(String[] args){
		Demo1 obj1=new Demo1();     //Demo1(obj1)

		Demo1 obj2=new Demo1(10);   //Demo1(obj2,10)
	}

	/*
	  According to bytecode the instatnce variable is decleared in both constructors but
	  actually at runtime it is initialize in only on constructor whose object is created
	  and statck frame is pushed in java statck.
	*/
}
