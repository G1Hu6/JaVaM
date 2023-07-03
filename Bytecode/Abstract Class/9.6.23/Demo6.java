abstract class Demo1{			// No Error.
        void carrer(){
                System.out.println("Doctor");
        }

        void marry(){
		System.out.println("Queen");
	}
}
class Child extends Demo1{
        void marry(){
                System.out.println("Kriti Sanon");
        }
}
//This is case of Simple overriding. (With 0 % of Abstraction)
