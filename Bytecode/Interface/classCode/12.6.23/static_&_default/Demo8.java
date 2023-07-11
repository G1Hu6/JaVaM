//After Java Version 1.8

interface Demo8{
	default void sun(){		//public default void sun()
	
	}
	static void fun(){		//public default void fun()
		
	}
}
/*
 	Bytecode:
superv@superv-VMware-Virtual-Platform:~/JavaClass/Bytecode/Interface/classCode/12.6.23/static_&_default$ javap -c Demo8.class

Compiled from "Demo8.java"
interface Demo8 {
  public default void sun();
    Code:
       0: return

  public static void fun();
    Code:
       0: return
}

 */

//Before Java Version 1.8
