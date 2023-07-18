/*
class Demo{
	public static void main(String[] args){
		try{
			System.out.println(10/0);
		}catch(Exception | RuntimeException | ArithmeticException obj){
			System.out.println("Exception");
		}
	}
}
*/
class Demo{
        public static void main(String[] args){
                try{
                        System.out.println(10/0);
                }catch(RuntimeException | ArithmeticException obj){
                        System.out.println("Exception");
                }
        }
}
/*
 * uperv@superv-VMware-Virtual-Platform:~/JavaClass/Bytecode/Exception Handling/18.7.23$ javac multipleExp_InCatch_1.java
multipleExp_InCatch_1.java:5: error: Alternatives in a multi-catch statement cannot be related by subclassing
		}catch(Exception | RuntimeException | ArithmeticException obj){
		                   ^
  Alternative RuntimeException is a subclass of alternative Exception
multipleExp_InCatch_1.java:5: error: Alternatives in a multi-catch statement cannot be related by subclassing
		}catch(Exception | RuntimeException | ArithmeticException obj){
		                                      ^
  Alternative ArithmeticException is a subclass of alternative Exception
2 errors

 */

