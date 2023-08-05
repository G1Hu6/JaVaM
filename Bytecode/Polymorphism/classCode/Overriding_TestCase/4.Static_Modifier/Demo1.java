// Static modifier cannot take part in Overriding. 


class Parent{
	static void fun(){
		System.out.println("In static-fun Parent");
	}
}
class Child extends Parent{
	void fun(){
		System.out.println("In fun Child");
	}
}

/*
error: fun() in Child cannot override fun() in Parent
	overridden method is static.
*/
