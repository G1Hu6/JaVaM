/*interface Core2Web{

	void lang();

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
		*/
/*
		Core2Web c2w = () -> System.out.println("Bootcamp/Java/Cpp");
		c2w.lang();
	}
}
*/

interface Core2Web{

        int lang();

}

class Year2022{
        public static void main(String[] args){
                /*
                Core2Web c2w = new Core2Web() ->{               // error: ';' expected
                        System.out.println("Bootcamp/Java/Cpp");
                };
                */

                /*
                Core2Web c2w = ()->{
                        System.out.println("Bootcamp/Java/Cpp");
                };
                c2w.lang();
                */

		//Core2Web c2w = ()-> return 8 ;	//error: illegal start of expression

                Core2Web c2w = ()-> 8 ;
		
		System.out.println(c2w);	//Year2022$$Lambda$1/0x0000000801000bd8@8bcc55f
		System.out.println(c2w.getClass().getName());		//Year2022$$Lambda$1/0x0000000801000bd8
		System.out.println(c2w.lang());

		//System.out.println((()->8).lang());
        }
}

