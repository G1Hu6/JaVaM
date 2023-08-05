/*
interface Demo1{
        static void fun(){
                System.out.println("In Fun-Demo1");
        }
}
class Demo1Child implements Demo1{
        void fun(){
		System.out.println("In Fun-Demo1Child");
	}
}
class Client{
        public static void main(String[] args){
                Demo1Child obj1=new Demo1Child();
                obj1.fun();   //In Fun-Demo1Child

                Demo1 obj2=new Demo1Child();
                //obj2.fun();   //error:illegal static interface method call

                Demo1.fun();     //In Fun-Demo1
        }
}
*/





interface Demo1{
        void fun();
}
class Demo1Child implements Demo1{
        static void fun(){
                System.out.println("In Fun-Demo1Child");
        }
}
class Client{
        public static void main(String[] args){
                Demo1Child obj1=new Demo1Child();
                obj1.fun();   //In Fun-Demo1Child

                Demo1 obj2=new Demo1Child();
                obj2.fun();   //error:illegal static interface method call

                //Demo1.fun();     //In Fun-Demo1
        }
}

//Error same as classes
/*
error: fun() in Demo1Child cannot implement fun() in Demo1
        static void fun(){
                    ^
  overriding method is static
 
 */
