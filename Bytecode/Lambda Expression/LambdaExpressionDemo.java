/*
interface Core2Web{

	void lang();

	default void Run(){
	
	}
}

class Year2022{
	public static void main(String[] args){
		/*
		Core2Web c2w = new Core2Web() ->{		// error: ';' expected
			System.out.println("Bootcamp/Java/Cpp");
		};
		*/

		/*
		Core2Web c2w = ()->{          
                        System.out.println("Bootcamp/Java/Cpp");
                };
		c2w.lang();
		
	}
}*/

interface Core2Web{

	String lang();

}

class Year2022{
	public static void main(String[] args){
		/*
		Core2Web c2w = ()->{
                        return "Bootcamp/Java/Cpp";
                };
		*/
		
		//Core2Web c2w = () -> return "StringWithoutBlock";	//error: illegal start of expression

		Core2Web c2w = () -> "StringWithoutBlock";

		//Core2Web c2w = () -> ;	//error: illegal start of expression
		System.out.println(c2w.lang());
	}
}

/*
 Using Lambda Expression only two .class files are formed so it saves memory.
*/
