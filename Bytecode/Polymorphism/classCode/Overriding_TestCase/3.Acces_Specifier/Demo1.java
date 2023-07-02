// Same access specifier and increasing scope specifier are allowed here.

// Decreasing acces specifier scope are not allowed here.

// Private access specifier has no impact in overriding.
class Parent{
	public void fun(){
		System.out.println("Parent fun");
	}
} 
class Child extends Parent{
	void fun(){
		System.out.println("Child fun");
	}
}
/*
  error: fun() in child cannot override fun() in Parent
  	attempting to assign weaker access privileges, was public.
*/ 
