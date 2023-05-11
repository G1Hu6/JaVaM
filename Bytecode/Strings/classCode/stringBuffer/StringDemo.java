class StringDemo{
	public static void main(String[] args){
		String str1="Shashi";
		System.out.println(System.identityHashCode(str1));

		str1=str1.concat("Bagal");
		System.out.println(System.identityHashCode(str1));
		System.out.println(str1);
	}
}
