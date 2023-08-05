class StackOverDemo{
        static void fun(int x){
                System.out.println(x);
                fun(++x);
        }
        public static void main(String[] args){
                try{
                        fun(1);
                }catch(StackOverflowError obj){                     //public class java.lang.StackOverflowError extends java.lang.VirtualMachineError
                        System.out.println("Exception in tread \"" + Thread.currentThread().getName() + "\" ");
			obj.printStackTrace();
                }
        }
}

