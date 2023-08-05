class Outer{
	class Inner{
		int x=11;
		static int y=50;	//error: illegal static decleration in Inner class Outer.Inner
					//modifier 'static' is only allowed in constant variable decleration. 
	}
}

//It is allowed after Java version 1.17
