class Demo3{
        int x=10;

        Demo3(){
                this(40);
                System.out.println("In No-Args Constructor");
        }

        Demo3(int x){
                //this(); 
		//super();    error:call to super must be the first statement in constructor
		
		//super();
                //this();     error:call to this must be the first statement in constructor
		//We can not call both at a time.
		
		super();
                System.out.println("In Para Constructor");
        }

        public static void main(String[] args){

                Demo3 obj1=new Demo3();
        }
}

