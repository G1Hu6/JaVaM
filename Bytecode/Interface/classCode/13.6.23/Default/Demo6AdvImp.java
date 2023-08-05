/* It is Advance Case When there is two different interfaces present with same methodes decleared as Default
   and we cannot override it then there error is present always.

   Code is Resteected here by java so, Java is not Purely OOL.

   If we use Default keyword In Interface, then the method must be override in Child.

   to overcome this static is introduced.



interface A{
	default void fun(){
		System.out.println("In Fun-A");
	}
}

interface B{
        default void fun(){
                System.out.println("In Fun-B");
        }
}

class Child implements A,B{
	//Both the methodes are present here but Ambiguity is there
	//Here we dident call these methodes in main but also there is Error.
}

//error: Types A and B are incompatable
//		class Child inherites unreleated defaults from types A and B.
 
*/

/*
 * Corrected Code:

 */
interface A{
        default void fun(){
                System.out.println("In Fun-A");
        }
}

interface B{
        default void fun(){
                System.out.println("In Fun-B");
        }
}

class Child implements A,B{
	void fun(){
		System.out.println("In Fun-Child");
	}
}

class Client{
	public static void main(String[] args){
		A obj1=new Child();
		obj1.fun();	//In Fun-Child
	}
}

