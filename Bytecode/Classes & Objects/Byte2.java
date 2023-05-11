class Byte2{
	int y=10;

	void static fun(){
		int z=20;
	}

	public static void main(String[] args){
		int x=30;
		fun();
	}
}
/*
 *Bytecode:

 king@king-VK:~/java_class/Bytecode/Classes & Objects$ javap -c Byte2.class
Compiled from "Byte2.java"
class Byte2 {
  int y;

  Byte2();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: aload_0
       5: bipush        10
       7: putfield      #7                  // Field y:I
      10: return

  static void fun();
    Code:
       0: bipush        20
       2: istore_0
       3: return

  public static void main(java.lang.String[]);
    Code:
       0: bipush        30
       2: istore_1
       3: invokestatic  #13                 // Method fun:()V
       6: return
}

 */
class Byte2{
        int y=10;

        void fun(){
                int z=20;
        }

        public static void main(String[] args){
                int x=30;
                Byte2 obj=new Byte2();
                obj.fun();
        }
}

/*
king@king-VK:~/java_class/Bytecode/Classes & Objects$ javap -c Byte2.class
Compiled from "Byte2.java"
class Byte2 {
  int y;

  Byte2();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: aload_0
       5: bipush        10
       7: putfield      #7                  // Field y:I
      10: return

  void fun();
    Code:
       0: bipush        20
       2: istore_1
       3: return

  public static void main(java.lang.String[]);
    Code:
       0: bipush        30
       2: istore_1
       3: new           #8                  // class Byte2
       6: dup
       7: invokespecial #13                 // Method "<init>":()V
      10: astore_2
      11: aload_2
      12: invokevirtual #14                 // Method fun:()V
      15: return
}
 
 */
