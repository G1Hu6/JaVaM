/*
class Parent{
	static int x=10;
}
class Child{
	public static void main(String[] args)
		//System.out.println(x);       error:cannot find symbol	
		System.out.println(Parent.x);  //10
	}
}

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
class Parent{
        static int x=10;
}
class Child extends Parent{
        public static void main(String[] args)
                System.out.println(x);         //10
                System.out.println(Parent.x);  //10
        }
}

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
class Parent{
        static int x=10;
	static{
                System.out.println("In Parent static Block");
        }
}
class Child{
        static{
		System.out.println("In Child static Block");
	}
}
class Client{
	public static void main(String[] args)
             
        }
}

No Output No error
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

class Parent{
        static int x=10;
        static{
                System.out.println("In Parent static Block");
        }
}
class Child extends Parent{
        static{
                System.out.println("In Child static Block");
        }
}
class Client{
        public static void main(String[] args){

             Child obj=new Child();
	}
}

king@king-VK:~$ java Client
In Parent static Block
In Child static Block

*/

class Parent{
        static int x=10;
        static{
               System.out.println("In Parent static Block");
	       System.out.println(x);
        }

	static void access() {
		System.out.println(x);
	}
}
class Child extends Parent{
        static{
                System.out.println("In Child static Block");
		System.out.println(x);
		access();  //Work Properly
        }
}
class Client{
        public static void main(String[] args){
	     System.out.println("In Main");
             Child obj=new Child();
        }
}

