/*interface Demo1{
        static void fun(){
                System.out.println("In Fun-Demo1");
        }
}

interface Demo2{
        static void fun(){
                System.out.println("In Fun-Demo2");
        }
}

class Demo1Child implements Demo1,Demo2{
        
}
class Client{
        public static void main(String[] args){
                Demo1Child obj1=new Demo1Child();
                obj1.fun();   //cannot find symbol

                Demo1 obj2=new Demo1Child();
                obj2.fun();   //error:illegal static interface method call
        }
}
*/



// Corrected code :

 interface Demo1{
        static void fun(){
                System.out.println("In Fun-Demo1");
        }
}

interface Demo2{
        static void fun(){
                System.out.println("In Fun-Demo2");
        }
}

class Demo1Child implements Demo1,Demo2{
        void fun(){
                System.out.println("In Fun-Demo1Child");
		Demo1.fun();
		Demo2.fun();
        }
}
class Client{
        public static void main(String[] args){
                Demo1Child obj1=new Demo1Child();
                obj1.fun();   

		Demo1Child obj2=new Demo1Child();
                obj2.fun();

		Demo1Child obj3=new Demo1Child();
                obj3.fun();
			//In Fun-Demo1Child
			//In Fun-Demo1
			//In Fun-Demo2

        }
}

