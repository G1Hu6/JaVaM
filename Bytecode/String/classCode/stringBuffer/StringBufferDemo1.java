class StringBufferDemo{
	public static void main(String args[]){
		//StringBuffer str1="Pranav";  error: incompatible types: String cannot be converted to StringBuffer
		StringBuffer str=new StringBuffer();
		System.out.println(str.capacity());

		StringBuffer str1=new StringBuffer("King");
		System.out.println(str1.capacity());

		System.out.println(str1);
		System.out.println(System.identityHashCode(str1));
		System.out.println(str1.hashCode());

		str1.append("SuperV");
		System.out.println(str1.capacity());

		System.out.println(str1);
                System.out.println(System.identityHashCode(str1));
                System.out.println(str1.hashCode());

		str1.append("alkslkaskldskdksjksuhdushu");
		System.out.println(str1.capacity());
		System.out.println(str1);
		System.out.println(System.identityHashCode(str1));
		System.out.println(str1.hashCode());
		System.out.println(str1.capacity());
	}
}
