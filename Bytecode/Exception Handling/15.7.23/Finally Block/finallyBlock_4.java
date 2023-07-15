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
                }catch(InterruptedException obj1){
                          System.out.println("Here...");
                }finally{
                          System.out.println("Connection Close...");
                }

                System.out.println("end main");
        }
}
/*
 * perv@superv-VMware-Virtual-Platform:~/JavaClass/Bytecode/Exception Handling/15.7.23/Finally Block$ javac finallyBlock_4.java
finallyBlock_4.java:16: error: exception InterruptedException is never thrown in body of corresponding try statement
                }catch(InterruptedException obj1){
                 ^
1 error

 */

