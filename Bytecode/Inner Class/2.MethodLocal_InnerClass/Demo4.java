class Outer{
        void fun(){
                System.out.println("In Fun-Outer");

            	class Inner{
                        void fun(){
                                System.out.println("In Fun-Inner");
                        }
                }
		Inner obj=new Inner();
		obj.fun();		//In Fun-Inner

		Outer obj1=new Outer();
		obj1.gun();		//In Gun-Outer

        }

        static void gun(){
                System.out.println("In Gun-Outer");
        }

        public static void main(String[] args){
                Outer obj1=new Outer();
                obj1.fun();     

                obj1.gun();
        }
}

