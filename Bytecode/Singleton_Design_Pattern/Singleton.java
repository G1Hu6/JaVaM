class Singleton{
	static Singleton obj=new Singleton();		//Here object is make as Static brecause we have to acces it in static main method.
	
	private Singleton(){				//Here Constructor is decleared as Private because we can not create its objects.
		System.out.println("Constructor");
	}

	static Singleton getObject(){
		return obj;
	}
}
class Client{
	public static void main(String[] args){
		Singleton obj1=Singleton.getObject();
		System.out.println(obj1);		//Singleton@7ad041f3
	
		Singleton obj2=Singleton.getObject();
		System.out.println(obj2);		//Singleton@7ad041f3
	
		Singleton obj3=Singleton.getObject();
		System.out.println(obj3);		//Singleton@7ad041f3
	}
}

//Whenever we create new object then old object is retuned always.
