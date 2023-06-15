class Outer{		//Outer.class
	class Inner{	//'Outer$Inner.class'
		
	}
}

/*
superv@superv-:~/JavaClass/Bytecode/Inner Class/Normal_InnerClass$ javac Demo1.java

superv@superv-:~/JavaClass/Bytecode/Inner Class/Normal_InnerClass$ ls
 		
		Demo1.java  'Outer$Inner.class'   Outer.class

**After Java 1.17
superv@superv-VMware-Virtual-Platform:~/JavaClass/Bytecode/Inner Class/Normal_InnerClass$ javap -c Outer\$Inner.class 
Compiled from "Demo1.java"
class Outer$Inner {
  Outer$Inner(Outer);
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: return
}


**Before
Compiled from "Demo1.java"
class Outer$Inner {
  final Outer this$0;

  Outer$Inner(Outer);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #1                  // Field this$0:LOuter;
       5: aload_0
       6: invokespecial #7                  // Method java/lang/Object."<init>":()V
       9: return
}

 */
