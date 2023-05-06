import java.io.*;
class P{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int size=Integer.parseInt(br.readLine());
		System.out.println("arr:");
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("output");
		for(int k=0;k<arr.length;k++){
			Am(arr[k],k);		
		}
	}
	static void Am(int a,int k){
		int count=0;
                        int n=a;
                        int nu=a;
                        while(n!=0){
                                count++;
                                n=n/10;
                        }
                        int sum=0;
                        while(nu!=0){
                                int b=1;
                                for(int j=0;j<count;j++){
                                        b=b*(nu%10);
                                }
                                sum=sum+b;
				nu=nu/10;
                        }
                        if(a==sum){
                                System.out.println("Armstrong number "+a+" at index "+k);
                        }

	}
}
