import java.io.*;
class RepDemo{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s1=br.readLine();
		System.out.println(s1.replace('s','A'));
		myRep(s1,'s','A');
		System.out.println(s1);

	}
	static void myRep(String str,char c,char c1){
		String str1=new String(str);
		char arr[]=str1.toCharArray();
		for(int i=0;i<arr.length;i++){
			if(arr[i]==c){
				arr[i]=c1;
			}
		}
		System.out.println(arr);
	}
}
