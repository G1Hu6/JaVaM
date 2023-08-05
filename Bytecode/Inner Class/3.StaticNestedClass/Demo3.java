class Outer{
        void m1(){
                System.out.println("In m1-Outer");
        }
        static class Inner{
		static void m3(){
			System.out.println("In Static m3-Inner");
		}
                void m1(){
                        System.out.println("In m1-Inner");
                }
        }

        public static void main(String[] args){
                Inner obj1=new Inner();        
		obj1.m1();

                Outer.Inner obj2=new Inner();      
		obj2.m1();

                //Outer.Inner obj3=new Outer().new Inner();	//error:qualified new of static class
		//obj3.m1();

                //Outer.Inner obj=this$0.new Inner();

               // Outer.Inner obj4=Outer.new Inner();		//error:cannot find symbol

                Outer.Inner obj=new Outer.Inner();
                obj.m1();
		
		Inner.m3();

		Outer.Inner.m3();
        }
}

