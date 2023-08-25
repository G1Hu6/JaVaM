interface Core2Web{

        int lang();

}

class Year2022{
        public static void main(String[] args){
                
                /*
		Core2Web c2w = ()-> 8.8 ;
		error: incompatible types: bad return type in lambda expression
                Core2Web c2w = ()-> 8.8 ;
                                    ^
    possible lossy conversion from double to int
		*/

		//Core2Web c2w = ()-> 'A';

		/*
		Core2Web c2w = ()-> "King" ;
		incompatible types: bad return type in lambda expression
		Core2Web c2w = ()-> "King" ;
		                    ^
    String cannot be converted to int
    		*/

		System.out.println(c2w.lang());
        }
}

