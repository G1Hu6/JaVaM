import java.io.*;
class Pro8{
	public static void main(String []p)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		for(int i=0;i<arr.length;i++){
			int count=0;
			int n=arr[i];
			int n1=arr[i];
			while(n!=0){
				count++;
				n=n/10;
			}
			int sum=0;
			while(n1!=0){
				int a=1;
				for(int j=0;j<count;j++){
					a=a*(n1%10);
				}
				sum=sum+a;
				n1=n1/10;
			}
			if(arr[i]==sum){
				System.out.println("Armstrong number "+arr[i]+" at index "+i);
			}
		}
	}
}
