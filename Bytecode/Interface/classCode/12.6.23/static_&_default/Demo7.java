/*
Defination: Interface is introduced in java because of multiple inheritance.
	    (100% abstraction) to handle abstraction also.

	    We can give body to interface After Java 1.8* with the help of
	    keywords like static and default

#SuperV: if one or more childs can inherit same method in interface then
	 Code Redundancy is increased(same code is repeated) so to avoid
	 this Java can allow body to abstract methodes After 1.8*
*/

interface Demo{
	void sun(){		//error: interface abstract methodes cannot have body.
	
	}
	void fun(){		//error: interface abstract methodes cannot have body.
		
	}
}

