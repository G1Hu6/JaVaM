class Demo3{
	Demo3(){
		System.out.println("In Core2Web");
	}
	int x=10;//Variables that are declered above or below constructor goes into constructor
	public static void main(String[] args){
		Demo3 obj=new Demo3();//Constructor called here
		System.out.println("In Main");
		System.out.println(obj.x);
	        System.out.println(obj.y);
	}
	int y=55;//Variables that are declered above or below constructor goes into constructor
}
/*
 * Compiled from "Demo3.java"
class Demo3 {
  int x;

  int y;

  Demo3();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: aload_0
       5: bipush        10
       7: putfield      #7                  // Field x:I
      10: aload_0
      11: bipush        55
      13: putfield      #13                 // Field y:I
      16: getstatic     #16                 // Field java/lang/System.out:Ljava/io/PrintStream;
      19: ldc           #22                 // String In Core2Web
      21: invokevirtual #24                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
      24: return

  public static void main(java.lang.String[]);
    Code:
       0: new           #8                  // class Demo3
       3: dup
       4: invokespecial #30                 // Method "<init>":()V
       7: astore_1
       8: getstatic     #16                 // Field java/lang/System.out:Ljava/io/PrintStream;
      11: ldc           #31                 // String In Main
      13: invokevirtual #24                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
      16: getstatic     #16                 // Field java/lang/System.out:Ljava/io/PrintStream;
      19: aload_1
      20: getfield      #7                  // Field x:I
      23: invokevirtual #33                 // Method java/io/PrintStream.println:(I)V
      26: getstatic     #16                 // Field java/lang/System.out:Ljava/io/PrintStream;
      29: aload_1
      30: getfield      #13                 // Field y:I
      33: invokevirtual #33                 // Method java/io/PrintStream.println:(I)V
      36: return
}

 */
