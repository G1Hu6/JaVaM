import java.io.*;
class IndexDemo1{
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str1=br.readLine();
		//String str2=br.readLine();
		System.out.println();
		//System.out.println(str1.compareTo(str2));
		System.out.println(str1.indexOf('a',3));
		System.out.println(myIndex(str1,'a',3));
		/*
		System.out.println(str1.indexOf('h',0));
		System.out.println(str1.indexOf('h',-10));
		System.out.println(str1.indexOf('h',5));
		System.out.println(str1.lastIndexOf('h',5));
		System.out.println(str1.lastIndexOf(65,10));
		*/
		char ch=(char)br.read();
		br.skip(1);
		int num=Integer.parseInt(br.readLine());

		System.out.println(str1.lastIndexOf(ch,num));
		System.out.println(myLastIndex(str1,ch,num));
	}
	static int myIndex(String str,char ch,int n){
		char arr[]=str.toCharArray();
		for(int i=n;i<arr.length;i++){
			if(ch==arr[i]){
				return i;
			}
		}
		return -1;
	}

	static int myLastIndex(String str,char ch,int n){
		char arr[]=str.toCharArray();
		for(int i=n;i>=0;i--){
			if(ch==arr[i]){
				return i;
			}
		}
		return -1;
	}
}
