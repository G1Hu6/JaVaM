class Open{
	int x=10;
	static int y=20; 
	public static void main(String[] n){
		Open obj=new Open();

		System.out.println(obj.x);
		System.out.println(y);
		//System.out.println(obj.y);
		fun();
		//obj.fun();
		obj.gun();
			
	}
	void gun(){
		System.out.println("In Gun....");
		//System.out.println(x); 10
                //System.out.println(y); 20
	}
	static void fun(){
		System.out.println("In Fun....");
	}
}
