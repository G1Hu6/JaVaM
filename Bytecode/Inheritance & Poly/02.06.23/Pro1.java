class Pro1{
	Pro1(){
		System.out.println("In Parent Constructor");
	}
}
class Child extends Pro1{
	
	Child(){
		super();   //invokespecial
			   //This line is because to initialize instance variables from Parent class.
		System.out.println("In Child Constructor");
	}
}

/*
 * Bytecode :
king@king-VK:~/java_class/Bytecode/Inheritance & Poly/02.06.23$ javap -c Child.class
Compiled from "Pro1.java"
class Child extends Pro1 {
  Child();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method Pro1."<init>":()V
       4: getstatic     #7                  // Field java/lang/System.out:Ljava/io/PrintStream;
       7: ldc           #13                 // String In Child Constructor
       9: invokevirtual #15                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
      12: return
}

 */

lass Pro1{
        Pro1(){
                System.out.println("In Parent Constructor");
        }
}
class Child extends Pro1{

        Child(){
                System.out.println("In Child Constructor");
        }
}

/*
 * Bytecode :
king@king-VK:~/java_class/Bytecode/Inheritance & Poly/02.06.23$ javap -c Child.class
Compiled from "Pro1.java"
class Child extends Pro1 {
  Child();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method Pro1."<init>":()V
       4: getstatic     #7                  // Field java/lang/System.out:Ljava/io/PrintStream;
       7: ldc           #13                 // String In Child Constructor
       9: invokevirtual #15                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
      12: return
}

 */

