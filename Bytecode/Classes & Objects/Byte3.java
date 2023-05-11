class Byte3{
	int a=10;
	int jerNo=18;
	static void fun(){
		int f=19;
	}
}
/*
 *Bytecode :
   
 king@king-VK:~/java_class/Bytecode/Classes & Objects$ javap -c Byte3.class
Compiled from "Byte3.java"
class Byte3 {
  int a;

  int jerNo;

  Byte3();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: aload_0
       5: bipush        10
       7: putfield      #7                  // Field a:I
      10: aload_0
      11: bipush        18
      13: putfield      #13                 // Field jerNo:I
      16: return

  static void fun();
    Code:
       0: bipush        19
       2: istore_0
       3: return
}

 */
