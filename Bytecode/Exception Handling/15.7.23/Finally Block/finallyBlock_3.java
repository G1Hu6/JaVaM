class Demo{
        void m1(){
                System.out.println("In m1");
        }
        void m2(){
                System.out.println("In m2");
        }
        public static void main(String[] args){
                Demo obj=new Demo();
                obj.m1();

                obj=null;

                try{
                        obj.m2();
                }catch(ArithmeticException obj1){
                          System.out.println("Here...");
                }finally{
                          System.out.println("Connection Close...");
                }

                System.out.println("end main");
        }
}

/*

In m1
Connection Close...
Exception in thread "main" java.lang.NullPointerException
	at Demo.main(finallyBlock_3.java:15)
 */
