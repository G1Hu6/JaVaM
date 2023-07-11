class Demo2{                                           
        void marry(){
                System.out.println("kriti senon");
        }
}
class Client{
        public static void main(String[] args){
                Demo2 obj2=new Demo2(){               
                        void marry(){
                                System.out.println("Disha Patani");
                                
                        }
                        Demo2 fun(){
                                System.out.println("In Fun");
				marry();
				return new Demo2();
                        }
                }.fun();
                obj2.marry();
        }
}

/*
 class Demo2{
        void marry(){
                System.out.println("kriti senon");
        }
}
class Client{
        public static void main(String[] args){
                Demo2 obj2=new Demo2(){
                        void marry(){
                                System.out.println("Disha Patani");

                        }
                        Demo2 fun(){
                                System.out.println("In Fun");
                                return new Demo2(){

                                };
                        }
                }.fun();
                obj2.marry();
        }
}

 */

/*
 superv@superv-VMware-Virtual-Platform:~/JavaClass/Bytecode/Inner Class/4.Annonymous_InnerClass/#SuperV$ javap -c Client$1.class
Compiled from "Demo4.java"
class Client {
  Client();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: return

  public static void main(java.lang.String[]);
    Code:
       0: new           #2                  // class Client$1
       3: dup
       4: invokespecial #3                  // Method Client$1."<init>":()V
       7: invokevirtual #4                  // Method Client$1.fun:()LDemo2;
      10: astore_1
      11: aload_1
      12: invokevirtual #5                  // Method Demo2.marry:()V
      15: return

 */
