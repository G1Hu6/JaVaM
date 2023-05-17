class Q8{
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer(); 
		for(int i = 0; i < 18;i++) {
			sb.append(i);
		}
		System.out.println(sb.length());
		System.out.println(sb.capacity());
	}
}

