class Outer{
        static void fun(){
                System.out.println("In Fun-Outer");

                class Inner{
                        static void fun(){
                                System.out.println("In Fun-Inner");
                        }
                }
		Inner.fun();

		//Outer obj=new Outer();
		//obj.fun();		//Recursive call	//Exception in thread "main" java.lang.StackOverflowError
        }

        static void gun(){
                System.out.println("In Gun-Outer");
        }
}

class Client{
        public static void main(String[] args){
                //Outer obj1=new Outer();
                Outer.fun();    
                                
                Outer.gun();
        }
}

