class Q2{
	public static void main(String[] args){
		StringBuffer str1= new StringBuffer("DEMO");
		StringBuffer str2= new StringBuffer();

		str2=str2.append("DEMO");
		System.out.println(str1.capacity()==str2.capacity());
	}
}
