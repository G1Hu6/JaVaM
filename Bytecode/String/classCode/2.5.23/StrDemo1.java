class StrDemo1{
	public static void main(String[]args){
		String str1="Core2Web";//SCP
		String str2=new String("Core2Web");//Heap
		char str3[]={'C','2','W'};

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		System.out.println(System.identityHashCode(str1));
                System.out.println(System.identityHashCode(str2));

		String str4="Core2Web";
		String str5=new String("Core2Web");

		System.out.println(System.identityHashCode(str4));
		System.out.println(System.identityHashCode(str5));
	}
}
