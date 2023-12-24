class DoubleRecursion_2{

	static int fun(int n){
	
		if(n <= 1)
			return 1;

		return fun(n-2) + fun(n-1);
	}
	public static void main(String[] args){
	
		int val = fun(5);
		System.out.println(val);
	}
}
