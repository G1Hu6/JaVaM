interface Demo1{
	void sun();		//public abstract void sun()
				//public is access specifier 

	static void fun(){
	
	}

	default void gun(){	
	
	}
}

class Demo1Child implements Demo1{
	
	void sun(){		//default is access specifier
		System.out.println("sun in Demo1Child");
	}
}	
/*
 Scope of method sun() is decreased from public to default so throw error

error:sun() in Demo1Child cannot implement sun() in Demo1
	void sun();
	     ^	
	attempting to assign weaker access privileges; was public
 */
