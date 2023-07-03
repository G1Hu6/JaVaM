abstract class Demo1{
	//abstract int fun(){		//error: abstract methods cannot have a body
	//	return 10;
	//}
	
	protected abstract int fun1();
	
	public abstract int fun2();
	
	//private abstract int fun3();	//error:illegal combination of modifiers; abstract and private	
	
	//static abstract int fun3();	//error:illegal combination of modifiers; abstract and final  
	
	//final abstract int fun4();	//error:error:illegal combination of modifiers; abstract and final
	
	//default abstract int fun5();	//error: modifier default not allowed here
	
}
