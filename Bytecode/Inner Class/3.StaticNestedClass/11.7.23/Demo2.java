class Outer{
	int a=10;
        static int b=20;

        static class Inner{
                int x=11;
                //static int y=50;
                final static int y=50;
        }
        public static void main(String[] args){
                //System.out.println(Outer.a);			//error: non-static variable a cannot be referenced from a static context
		System.out.println(Outer.b);
         
                Outer obj=new Outer();
		System.out.println(obj.a);
		System.out.println(new Outer().a);
		
		System.out.println(Inner.y); //20
		//System.out.println(Inner.x); 			//error: non-static variable x cannot be referenced from a static context
		System.out.println(new Inner().x);
		
		System.out.println(new Outer.Inner().x);		
	}
}
