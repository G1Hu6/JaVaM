class InstBlock1{
	int x=10;
	InstBlock1(){
		System.out.println("In Constructor...");
		System.out.println(x);
    		//System.out.println(y);  error: cannot find symbol
	}
	
	{
		System.out.println("In Instance Block 1...");
	 	//System.out.println(y);  //error: cannot find symbol
	}
	
	public static void main(String[] args){
		InstBlock1 obj = new InstBlock1();
		System.out.println("In Main...");
	}

	{
		int  y=20;
                System.out.println("In Instance Block 2...");
		System.out.println(x);
		System.out.println(y);
        }

}
