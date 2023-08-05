//To remove this 'atempting to access.... ' error then we have to use 'Final' keyword.
//A method decleared with final keyword cannot be overridden.



/*
class Parent{
        final void fun(){

        }
}
class Child extends Parent{
        void fun(){

        }
}

error: fun() in Child cannot override fun() in child.
	overridden method is final.
*/


class Parent{
	void fun(){
		System.out.println("In fun Parent");	
	}
}
class Child extends Parent{
	final void fun(){		//No Error
		System.out.println("In fun-final Child");
	}
}

/*
class Child1 extends Child{
	public void fun(){
	
	}
}
error: fun() in Child cannot override fun() in child.
        overridden method is final.

*/

class Client{
	public static void main(String[] args){
		Parent obj =new Child();
		obj.fun();
	}
}
