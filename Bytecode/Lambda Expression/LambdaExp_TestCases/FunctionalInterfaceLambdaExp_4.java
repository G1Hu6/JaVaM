interface Core2Web{

        void lang();
        void lang2();
}

//Solve Error .....

class Client{
	public static void main(String[] args){
                /*
                Core2Web c2w = new Core2Web() ->{               // error: ';' expected
                        System.out.println("Bootcamp/Java/Cpp");
                };
                */


                Core2Web c2w = ()->{
                        System.out.println("Bootcamp/Java/Cpp");
                };
                c2w.lang();

        }
}
