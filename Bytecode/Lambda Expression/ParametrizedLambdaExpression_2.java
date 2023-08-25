/*
interface Core2Web{

	String lang(int numCourse);
}

class Year2022{
	public static void main(String[] args){
		

		Core2Web c2w = (xyz)->{          
                        return "Java"+" : "+ xyz;
                };					//rror: incompatible types: bad return type in lambda expression

		//Core2Web c2w = (xyz) -> "Java"+" : "+ xyz;
		System.out.println(c2w.lang(8));
		
	}
}
*/

interface Core2Web{

        String lang(String startup1 , String startup2);
}

class Year2022{
        public static void main(String[] args){


                Core2Web c2w = (com1,xyz)->{
                        return  com1 +" & "+ xyz +" By Shashi";
                };                                      //rror: incompatible types: bad return type in lambda expression

                //Core2Web c2w = (xyz) -> "Java"+" : "+ xyz;
                System.out.println(c2w.lang("Incubator","Core2Web"));

        }
}

