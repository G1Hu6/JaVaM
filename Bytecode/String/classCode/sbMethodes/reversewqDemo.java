class ReverseDemo{
	public static void main(String[] args){
		StringBuffer sb=new StringBuffer("Core2Web");
		System.out.println(sb.reverse());

		String str="Pranav";
		//str.reverse(); error: cannot find symbol

		StringBuffer sb2=new StringBuffer(str); 
		//str=sb2.reverse();	error: incompatible types: StringBuffer cannot be converted to String
		str=sb2.reverse().toString();//Method chaining (Object class method)
		System.out.println(str);

		myRevStr("Pranav");
	}
	static void myRevStr(String str){
		char arr[]=str.toCharArray();
		char arr1[]=new char[arr.length];
		int j=0;
		for(int i=arr.length-1;i>=0;i--){
			arr1[j]=arr[i];
			j++;
		}
		System.out.println(arr1);
	}
}
