abstract class Core2Web{

	abstract void lang();

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
