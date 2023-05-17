class Q5{
	public static void main(String[] args) {
		String s1 = new String("core2web");
		String s2 = new String("core2web");
                if(System.identityHashCode(s1).equals(System.identityHashCode(s2)))// error: int cannot be dereferenced
			System.out.println("True");
		else
			System.out.println("False");
	}
}

