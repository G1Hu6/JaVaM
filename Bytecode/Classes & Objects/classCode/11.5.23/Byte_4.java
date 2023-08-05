/*
class Byte4{
        int x=40;
        static int y=90; //static variable get memeory into Static block
}
//
 * Bytecode :
  king@king-VK:~/java_class/Bytecode/Classes & Objects$ javap -c Demo.class
Compiled from "Byte4.java"
class Demo {
  int x;

  static int y;

  Demo();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: aload_0
       5: bipush        40
       7: putfield      #7                  // Field x:I
      10: return

  static {};
    Code:
       0: bipush        90
       2: putstatic     #13                 // Field y:I
       5: return
}
 */

class Byte4{
        int x=40;
        static int y=90; //static variable get memeory into Static block
        static void fun(){
                int z=11;
        }
}
/*
 king@king-VK:~/java_class/Bytecode/Classes & Objects/11.5.23$ javap -c Byte4.class
Compiled from "Byte_4.java"
class Byte4 {
  int x;

  static int y;

  Byte4();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: aload_0
       5: bipush        40
       7: putfield      #7                  // Field x:I
      10: return

  static void fun();
    Code:
       0: bipush        11
       2: istore_0
       3: return

  static {};
    Code:
       0: bipush        90
       2: putstatic     #13                 // Field y:I
       5: return
}

 */

