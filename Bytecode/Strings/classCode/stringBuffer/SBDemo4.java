class SBDemo4{
	public static void main(String[] args){
		String str1="Shashi";
		String str2=new String("Bagal");
		StringBuffer str3=new StringBuffer("Core2Web");

		//String str4=str1.append(str3);  error: cannot find symbol
		//String str4=str3.append(str1);  error: incompatible type:StringBuffer cannot be converted to string
		StringBuffer str4=str3.append(str1);   //new StringBuffer("ShashiCore2Web")

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		               
		//String str5=str1.concat(str3);   error: incompatible type:StringBuffer cannot be converted to string
		StringBuffer str5=str3.append(str2);

		System.out.println(str1);
                System.out.println(str2);
                System.out.println(str3);
		System.out.println(str5);
	}
}
