class ThreadDemo2{
	static void fun(){
		for(int i=0;i<10;i++){
			System.out.println(i);
		}
	}
	public static void main(String[] args){
		for(int i=10;i<20;i++){
                        System.out.println(i);
			Thread.sleep(2000);	//error: unreported exception InterruptedException; must be caught or declear to be thrown.
                }
		fun();
	}
}
