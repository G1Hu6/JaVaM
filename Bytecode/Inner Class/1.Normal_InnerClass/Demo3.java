/*
class Outer{
	class Inner{
		void fun(){
			System.out.println("In fun-Outer");
		}
	}
	void gun(){
                        System.out.println("In gun-Inner");
                }

	public static void main(String[] args){
		Outer obj1=new Outer();
		obj1.gun();		//In gun-Inner
		
		//Inner obj=new Inner();		//non-static variable this cannot be referenced from a static context

		Outer.Inner obj2=new Outer().new Inner();
		obj2.fun();		//In fun-Outer
	}
}
*/

class Outer{
        class Inner{
               static void fun(){
                        System.out.println("In fun-Outer");
			//System.out.println(this);
                }
        }
        static void gun(){
                        System.out.println("In gun-Inner");
			//System.out.println(this$0);
        }

/*
        public static void main(String[] args){
                Outer obj1=new Outer();
                obj1.gun();          

                Outer.gun();
		Inner.fun();

               // Outer.Inner obj2=new Outer().new Inner();
	       	Inner obj2=new Outer().new Inner();
                obj2.fun();             //In fun-Outer

        }
*/
}
class Client{
	public static void main(String[] args){
                Outer.gun();
                //Inner.fun();		//error: cannot find symbol
		Outer.Inner.fun();	
	}
}

