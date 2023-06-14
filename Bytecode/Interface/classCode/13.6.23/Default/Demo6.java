interface Demo5{

        default void fun(){
                System.out.println("In Fun-Demo5");
        }
}

class Demo5Child implements Demo5{
        void gun(){
                System.out.println("In Gun-Demo5Child");
        }
        public void fun(){
                System.out.println("In Fun-Demo5Child");
        }
}

class Client{
        public static void main(String[] args){
                Demo5Child obj1=new Demo5Child();
                obj1.gun();     //In Gun-Demo5Child
                obj1.fun();     //In Fun-Demo5Child

                //Demo5 obj2=new Demo5();
                /*
                 error: Demo5 is abstract; cannot be instantiated
                Demo5 obj2=new Demo5();
                           ^
                */

                Demo5 obj2=new Demo5Child();
                //obj2.gun();     //error: cannot find symbol    
                obj2.fun();     //In Fun-Demo5Child
        }
}

