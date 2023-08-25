// Lambda Expression Java 1.8

interface Core2Web{

	void lang();
	void lang2();

}

class Year2022{
	public static void main(String[] args){
		/*
		Core2Web c2w = new Core2Web() ->{		// error: ';' expected
			System.out.println("Bootcamp/Java/Cpp");
		};
		*/

		Core2Web c2w = ()->{          
                        System.out.println("Bootcamp/Java/Cpp");
                };
		c2w.lang();
	}
}

/*
 error: incompatible types: Core2Web is not a functional interface
		Core2Web c2w = ()->{          
		               ^
    	multiple non-overriding abstract methods found in interface Core2Web

 to remove we have to give body to other method.
 */
