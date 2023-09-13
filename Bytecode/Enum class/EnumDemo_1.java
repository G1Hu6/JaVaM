/*				    Enum Class
 1) This is the common base class of all Java language enumeration classes.	 
 2) Enum is treated as a class Internally.
*/

enum ProgLang{
	C, Cpp, Java, Python;	//By default static
}

class EnumDemo{
	public static void main(String[] args){
		System.out.println(ProgLang.C);
		System.out.println(ProgLang.Java);

		ProgLang lang = ProgLang.Java;
		
		System.out.println(lang);
		System.out.println(lang.name());
		System.out.println(lang.toString());

		System.out.println(lang.ordinal());
	}
}
