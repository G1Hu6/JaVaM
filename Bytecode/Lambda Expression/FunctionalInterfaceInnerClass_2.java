// Functional Interface is a Interface in which only one abstract method is present.

// Lambda Expression : Lambda Expression is used to create instances of Functional Interface
// Lambda Expression work on only functional Interface. 

// The compiler will treat any interface meeting the definition of a functional interface as a functional interface regardless of whether or not a FunctionalInterface annotation is present on the interface declaration.

// Java version 1.8


interface Core2Web{

        void lang();            // Only one public abstract method is present.

}

class Year2022{
        public static void main(String[] args){

                Core2Web c2w = new Core2Web(){          // 'Year2022$1.class'
                        public void lang(){
                                System.out.println("Java/Cpp/Dsa/Dart");
                        }
                };

                c2w.lang();	// Java/Cpp/Dsa/Dart
        }
}

/*Total .class files : 1) Core2Web.class
 		       2) Year2022.class
		       3) 'Year2022$1.class'

 1) This is heavy task because here 3  .class files are created.
 2) So whenever there is Functional Interface we have to use Lambda Expression insted of using Inner Class.
 
*/
