import java.io.*;
class VowelsInArray{
	public static void main(String[] p)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int size=Integer.parseInt(br.readLine());
		char arr[]=new char[size];
		for(int i=0;i<arr.length;i++){
			arr[i]=(char)br.read();
			br.skip(1);
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U'||arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'){
				System.out.print(arr[i]);
			}
		}
	}
}
