class Q7{
	public static void main(String[] args){
		StringBuffer str= new StringBuffer(400);
		str.append("Java_Developement_Kit");
		str.trimToSize();
		str.setLength(10);
		System.out.println(str.capacity());
		System.out.println(str.length());
	}
}
