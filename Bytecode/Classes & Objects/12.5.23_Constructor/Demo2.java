class Demo2{
	Demo2(){
		System.out.println("In Constructor");
	}
	public static void main(String[] args){
	
	}
}
/*
 king@king-VK:~/java_class/Bytecode/Classes & Objects/12.5.23_Constructor$ javap -c Demo2.class
Compiled from "Demo2.java"
class Demo2 {
  Demo2();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: getstatic     #7                  // Field java/lang/System.out:Ljava/io/PrintStream;
       7: ldc           #13                 // String In Constructor
       9: invokevirtual #15                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
      12: return

  public static void main(java.lang.String[]);
    Code:
       0: return
}

 */

