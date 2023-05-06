import java.io.*;
class Pro7{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		for(int i=0;i<arr.length;i++){
			stg(arr[i],i);
		}
	}
	static void stg(int a,int j){
		int sum=0;
		int n=a;
		int s=a;
		while(n!=0){
			int b=1;
			for(int i=1;i<=n%10;i++){
				b=b*i;	
			}
			sum=sum+b;
			n=n/10;
		}
		if(sum==s){
			System.out.println("Strong number "+s+" at index "+j);
		}
	} 
} 
