// Interface are having all methodes in it as public

interface Demo1{
	static void fun(){	//public static void fun()
	
	}

	default void gun(){	//public static void fun()
	
	}
}
/*	Bytecode:

superv@superv-VMware-Virtual-Platform:~/JavaClass/Bytecode/Interface/classCode/15.6.23$ javap -c Demo1.class 
Compiled from "Demo1.java"

interface Demo1 {
  public static void fun();
    Code:
       0: return

  public default void gun();
    Code:
       0: return
}

 */
