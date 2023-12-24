class RecDemo3{

	static int fun(int num){
	
		if(num == 0)
			return 1;
		return fun(--num) + 3;
	}

	static int fun1(int num){
	
		if(num == 0)
			return 1;

		return num + fun1(--num);
	}
	public static void main(String[] args){
	
		System.out.println(fun1(3));
	}
}
