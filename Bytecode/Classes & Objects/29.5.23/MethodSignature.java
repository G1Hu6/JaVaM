class MethodSign{
	int x=10;

	MethodSign(){
		System.out.println("x ="+ x);
	}
	
	MethodSign(){      // MethodSign()
		System.out.println("x ="+ x);
	}
	fun(int x){        //fun(int)
		System.out.println("x ="+ x);
	}
	// error: constructor MethodSign() is already defined in class MethodSign
	// If same Method Signature found in Method Table then compiler will Throw error.
}
