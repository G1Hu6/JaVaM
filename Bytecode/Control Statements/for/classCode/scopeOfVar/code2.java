/*
class C2w{
	public static void main(String args[]){
	int x=10;
	{
		int y=20;
                System.out.println(x+" "+y);
        }

	{
		System.out.println(x+" "+y);
	}

        System.out.println(x+" "+y);
	}
}

 error: cannot find symbol
		System.out.println(x+" "+y);
		                         ^
  symbol:   variable y
  location: class C2w
code2.java:13: error: cannot find symbol
        System.out.println(x+" "+y);
                                 ^
  symbol:   variable y
  location: class C2w
2 errors
*/

class C2w{
        public static void main(String args[]){
        int x=10;
        {
		int x=11;
                int y=20;
                System.out.println(x+" "+y);
        }

        {
		int y=15;
                System.out.println(x+" "+y);
        }

//        System.out.println(x+" "+y);//1Error
        }
}

