//java can allocate memory to java Stack such can it execute approx 10660 stack frames.(C can handle arround 500k)

class StackOverDemo{
        static void fun(int x){
                System.out.println(x);
                fun(++x);
        }
        public static void main(String[] args){
                try{
			fun(1);
		}catch(StackOverflowError obj){			//public class java.lang.StackOverflowError extends java.lang.VirtualMachineError
			System.out.println("Error...");		//We can not handle Error in Java.
		}
        }
}

