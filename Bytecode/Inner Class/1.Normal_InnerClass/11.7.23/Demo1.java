/*
class OuterDemo1{
	int x=10;
	static int y=20;
	void fun(){
		int a=11;
		//static int b=22;		//error: illegal start of expresion
	}
}
class Client{
	public static void main(String[] args){
		int p=40;
		//static int q=70;		//error: illegal start of expresion
	}
}
*/
/*
 	1.static variable is not allowed in static method and non-static method also.
	
	2.In class both static and non-static are allowed. 
*/


class OuterDemo1{
        int x=10;
        static int y=20;
        void fun(){
                int a=11;
                //final static int b=22;              //error: modifier static not allowed here
        }
}
class Client{
        public static void main(String[] args){
                int p=40;
                //final static int q=70;              //error: modifier static not allowed here
        }
}

