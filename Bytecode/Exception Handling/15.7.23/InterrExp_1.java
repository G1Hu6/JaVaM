class IExp{
	public static void main(String[] args){
		for(int i=0;i<=10;i++){
			System.out.println("In Loop");
			Thread.sleep(5000);	//5 sec
						// error: unreported exception InterruptedException; must be caught or decleared to be thrown.
		}
	}
}
