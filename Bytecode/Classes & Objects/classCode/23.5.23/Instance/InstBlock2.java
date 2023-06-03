class InstBlock2{
	int x=10;
	InstBlock2(){
		System.out.println("In Constructor...");
	}
	
	{
		System.out.println("In Instance Block 1...");
	}

	static{
		System.out.println("In Static  Block 1...");
	}
	
	public static void main(String[] args){
		InstBlock2 obj = new InstBlock2();
		System.out.println("In Main...");
	}
	
	static{
                System.out.println("In Static  Block 2...");
        }

	{
                System.out.println("In Instance Block 2...");
        }

}
