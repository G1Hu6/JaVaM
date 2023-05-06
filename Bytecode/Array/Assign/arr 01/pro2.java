import java.io.*;
class Pro2{
	public static void main(String[] w)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int size=Integer.parseInt(br.readLine());
		int eMul=1;
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
			if(arr[i]%2==0)
				eMul=eMul*arr[i];
		}
		System.out.println("Multiplicaon of even numbers="+eMul);
	}
}
