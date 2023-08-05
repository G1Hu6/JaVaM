interface Demo{
	int x=10;

	void fun();
}
/*
 	* Bytecode :
 interface Demo{
 	public static final int x;

	public abstract void fun();
 }

 
//In Interface static variable cannot goes into static block whenever we call in in code at that line it is intialized.

//Static variable in interface get memory on stack frame.
 */
