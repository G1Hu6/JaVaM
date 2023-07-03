
/*
abstract class Demo1{
        void carrer(){
                System.out.println("Doctor");
        }

        abstract void marry();
}
class Child extends Demo1{			// error: Child is not abstract and does not override abstract method marry() in Demo1.

}
class Client{
       
}
*/




/*
 	Here two ways to remove error:
	
	1.Child class can be decleared as abstract.
	2.By giving body to methodes which are abstract in Parent class.
*/


// Case 1:

/*abstract class Demo1{
        void carrer(){
                System.out.println("Doctor");
        }

        abstract void marry();
}
abstract class Child extends Demo1{			// Error Removed.

}

//Inorder to use marry method we have to give body in next derived class of Child.
class Client{
       
}
*/

// Case 2:
abstract class Demo1{
        void carrer(){
                System.out.println("Doctor");
        }

        abstract void marry();
}
class Child extends Demo1{                     // Error Removed.
	void marry(){
	
	}
}

