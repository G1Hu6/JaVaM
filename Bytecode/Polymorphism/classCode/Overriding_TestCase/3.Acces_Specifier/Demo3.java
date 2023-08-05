// private access specifier
class Parent{
	private void fun(){
		System.out.println("Parent fun");
	}
} 
class Child extends Parent{
	void fun(){
		System.out.println("Child fun");
	}
}
//Here Scope of access specifier is Decreased but error not arrises because Private access Specifier cannot take part in Overriding.
//But we cannot access private method in other class
