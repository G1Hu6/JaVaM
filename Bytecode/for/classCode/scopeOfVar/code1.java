class C2w{
	public static void main(String args[]){
	int x=10,y=20;
	{
                System.out.println(x+" "+y);//10 20
        }

	{
		x=20;
		System.out.println(x+" "+y);//20 20
	}

        System.out.println(x+" "+y);//20 20
	}
}
