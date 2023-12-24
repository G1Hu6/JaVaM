class DoubleRecursion_4{
	static int fun(int num){
	
		if(num <= 0){
		
			return 2;
		}
		int ans1 = fun(num-1) + fun(num-2);
		int ans2 = fun(num-2) + fun(num-1);

		return ans1 + ans2;
	}

	public static void main(String[] args){
	
		System.out.println(fun(3));	// 56
	}
}
