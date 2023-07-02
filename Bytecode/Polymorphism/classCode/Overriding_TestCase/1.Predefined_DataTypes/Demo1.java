class Parent{
	int fun(){
		System.out.println("Parent-fun");
		return 10;
	}
}
class Child extends Parent{
	char fun(){
                System.out.println("Child-fun");
                return 'S';
        }
}
class Client{
	public static void main(String[] args){
		Parent obj=new Parent();
		obj.fun();		//error: fun() in Child cannot override fun() in Parent
					//return type char is not compatible with int
	}
}

/*
 After Version_1.4 :
 	Return type must be same.

 Before Version_1.4 :
 	Parent Child Realeation is allowed in Return type,applicable for classes only.
	not applicable for primitive data types.
 */
