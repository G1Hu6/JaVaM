interface Demo1{
	void sun();		//public abstract void sun()

	static void fun(){	//public static void fun()
	
	}

	default void gun(){	//public static void fun()
	
	}
}

class Demo1Child implements Demo1{
				//Here we can remove error using two ways
				//1.child class should be declear as Abstract
				//2.all abstrct methodes in interface Demo1 must be declear in Child class.
}

/*
error: Demo1Child is not abstract and does not override method sun() in Demo1.
	class Demo1Child implements Demo1{
	^
 */
