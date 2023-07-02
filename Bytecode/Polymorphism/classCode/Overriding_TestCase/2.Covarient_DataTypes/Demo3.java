class Demo2{
	String fun(){
		return new String();
	}
}
class Child extends Demo2{
	Object fun(){
		return "VK";
	}
}
/*
  error: fun() in child cannot override fun() in Parent
  	return type Object is not compatible with String.	
*/
