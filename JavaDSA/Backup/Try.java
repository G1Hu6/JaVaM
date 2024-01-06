class Fibonachi{
	static int b = 0;
	static int fib(int num){
		if(num <= 1)
			return 1;
		int a = fib(num-2)+fib(num-1);
		if(b < a){
			System.out.println(a);
		}
		b = a;
		return a;
	}
	public static void main(String[] args){
		fib(10);
	}
}
