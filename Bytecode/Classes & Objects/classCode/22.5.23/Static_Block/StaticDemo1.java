class StaticDemo1{
	static int x=10;
	static{
		System.out.println("In Static Block...");
		System.out.println(x);
	}
	public static void main(String[] args){
		System.out.println("In Main method...");
	}
}
