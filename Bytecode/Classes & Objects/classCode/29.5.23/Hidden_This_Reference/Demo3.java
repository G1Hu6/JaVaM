class Demo3{
	int x=10;

	Demo3(){         
		System.out.println("In No-Args Constructor");
	}

	Demo3(int x){   
		this();   //Demo3();   Constructor Chaining
		System.out.println("In Para Constructor");
		//this();    error: call to this must be first statement in constructor
	}
	
	public static void main(String[] args){

		Demo3 obj2=new Demo3(10); 
	        	
	}
	/*
	 Whenever we use this() then the constructor call our own class constructor 
	 insted of calling its parent class constructor(incokespecial)

	 Proof : ByteCode
	*/
}









/*
 class Demo3{
        int x=10;
        Demo3(){
                this(40);
        }

        Demo3(int x){
                this(); 
        }

        public static void main(String[] args){

                Demo3 obj2=new Demo3(10);
        }
}

error: recursive constructor invocation
 */
