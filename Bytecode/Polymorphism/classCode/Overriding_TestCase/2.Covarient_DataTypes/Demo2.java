class Demo2{
	StringBuffer fun(){
		return new StringBuffer();
	}
}
class Child extends Demo2{
	String fun(){
		return "VK";
	}
}
/*
  error: fun() in child cannot override fun() in Parent
  	return type String is not compatible with StringBuffer.	
 */
