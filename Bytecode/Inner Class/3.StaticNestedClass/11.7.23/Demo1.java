class Outer{
	int a=10;
        static int b=20;

        static class Inner{
                int x=11;
                //static int y=50;
                final static int y=50;
        }
}
class Client{
        public static void main(String[] args){
                System.out.println(Outer.b);
         
                Outer obj=new Outer();
                System.out.println(obj.b); //20
		System.out.println(obj.a); //10
					   
		System.out.println(Outer.Inner.y); //20
		//System.out.println(Outer.Inner.x); //error: non-static variable x cannot be referenced from static context.

                //Outer.Inner obj1=obj.new Inner();		//error: qualified new of static class
		//Outer.Inner obj2=Outer.new Inner();		//error: cannot find symbol.
	
		Outer.Inner obj2=new Outer.Inner();
                System.out.println(obj2.x);
		
		System.out.println(Outer.Inner.y);
                //System.out.println(new Outer().Inner.y);      //unexpected type
                
		//System.out.println(Outer.new Inner().y);	//error: cannot find symbol.
		
		System.out.println(new Outer.Inner().y);	
        }
}

