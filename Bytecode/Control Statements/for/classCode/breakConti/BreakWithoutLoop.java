class BreakWithoutLoop{
	public static void main(String[] args){
		int i=2;
		if(i==2){
			//break;		//error: break outside switch or loop
			continue;		//error: continue outside of loop
		}
		System.out.println("After Break");
	}
}
