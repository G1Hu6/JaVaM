class CharatDemo{
	public static void main(String[] p){
		String str="Charpppp";
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(6));
		System.out.println(str.charAt(9));//java.lang.StringIndexOutOfBoundsException: Index 9 out of bounds for length 8
	}
}
