import java.io.*;
class Pro2{
	public static void main(String[]p)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		Pro2 obj=new Pro2();
		System.out.println("Reversed Array :");
		for(int i=0;i<arr.length;i++){
			/*
			int rev=0;
			while(arr[i]!=0){
				rev=rev*10+(arr[i]%10);
				arr[i]=arr[i]/10;
			}
			System.out.println(rev);
			*/
			System.out.println(obj.rev(arr[i]));
		}
	}
	int rev(int a){
        int r=0;
        while(a!=0){
             r=r*10+(a%10);
             a=a/10;
             }
             return r;
     }
}


