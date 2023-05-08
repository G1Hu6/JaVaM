import java.io.*;
class Pro1{
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		for(int i=0;i<arr.length;i++){
			int count=0;
			int n=arr[i];
			while(n>0){
				count++;
				n=n/10;
			}
			System.out.println(count+" ");
		}
	}
}
