class Demo2{                                            //Parent class
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
                        void fun(){
                                System.out.println("In Fun");
                        }
                }.fun();
                obj2.marry();
        }
}
/*
 error: incompatible types: void cannot be converted to Demo2
                }.fun();
                     ^

 */

