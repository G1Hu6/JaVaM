class Q7{
	public static void main(String[] args) {
		StringBuffer var1 = new StringBuffer("Shashi");
		StringBuffer var2 = new StringBuffer("Shashi");
		System.out.println(var1.equals(var2));//it compares actual objects so false
		var1.setLength(3);
		System.out.println(var1);
	}
}

