//All the methods are Public abstract in interface.(100 % Abstraction)
//We can not create object of interface, Interface is a incomplete-class.
//Interface does not have constructor in it.(Object class is not parent of interface)
//Interface is a class(We can create its Bytecode)


interface Demo1{
	void gun();

	void fun();
}
class Child implements Demo1{		//error: Child is not abstract and does not override abstract method fun() in Demo1

}

/*
    Definition: Interface is an incomplete class with all the mwthods in it decleared 
                as abstract by compiler.
*/
