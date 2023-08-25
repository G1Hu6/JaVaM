// Functional Interface is a Interface in which only one abstract method is present.

// Lambda Expression : Lambda Expression is used to create instances of Functional Interface
// Lambda Expression work on only functional Interface. 

// The compiler will treat any interface meeting the definition of a functional interface as a functional interface regardless of whether or not a FunctionalInterface annotation is present on the interface declaration.

// Java version 1.8


interface Core2Web{

	void lang();		// Only one public abstract method is present.

}

class Year2022{
	public static void main(String[] args){
		
		Core2Web c2w = new Core2Web(){		// 'Year2022$1.class'
			void lang(){
				System.out.println("Java/Cpp/Dsa/Dart");
			}
		};

		c2w.lang();
		/*
		 error: lang() in <anonymous Year2022$1> cannot implement lang() in Core2Web.
		 	attempting to assign weaker access privileges; was public.
		 */
	}
}
