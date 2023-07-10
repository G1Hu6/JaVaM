class Outer{
        class Inner{
                void fun(){
                        System.out.println("In fun-Outer");
			//System.out.println(this$0);
			System.out.println(this);
			System.out.println(new Outer());
                }
        }
        void gun(){
                        System.out.println("In gun-Inner");
                }
}
class Client{
        public static void main(String[] args){
                Outer obj=new Outer();
		obj.gun();		//gun(obj);	Internal call

		Outer.Inner obj1=new Outer().new Inner();	//Proper Protocall
								//Outer$Inner(obj1, new Outer());
		obj1.fun();	

		/*
		 Outer.Inner obj1=obj.new Inner();		 //Outer$Inner(obj1, obj);
		 Outer.Inner obj2=obj.new Inner();		 //Outer$Inner(obj2, obj);
		 */

	}
}

/*
 Compiled from "Demo1.java"
class Outer$Inner {
  final Outer this$0;

  Outer$Inner(Outer);	//------------------------------------------------------------------------------------>	Outer$Inner(Outer$Inner this,Outer this$0)								
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #1                  // Field this$0:LOuter;
       5: aload_0
       6: invokespecial #7                  // Method java/lang/Object."<init>":()V
       9: return

  void fun();
    Code:
       0: getstatic     #13                 // Field java/lang/System.out:Ljava/io/PrintStream;
       3: ldc           #19                 // String In fun-Outer
       5: invokevirtual #21                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
       8: return
}

*/
