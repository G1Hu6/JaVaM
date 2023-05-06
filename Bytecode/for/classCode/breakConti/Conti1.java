class Conti{
	public static void main(String ar[]){
		int N=10;
		for(int i=1;i<N;i++){
			if(i%3==0)
				continue;
			System.out.println(i);
		}
		/*
		if(i==8)
			break;
		
		error: break outside switch or loop
			break;
			^
		*/
	}
}
