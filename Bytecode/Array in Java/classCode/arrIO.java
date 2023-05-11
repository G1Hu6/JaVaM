//if this line is not written then gives 4 error
import java.io.*;
class ArrIO{
	public static void main(String[]o)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int arr[]=new int [4];

		//arr[0]=Integer.parseInt(br.readLine());
		//arr[1]=Integer.parseInt(br.readLine());
		//arr[2]=Integer.parseInt(br.readLine());
		//arr[3]=Integer.parseInt(br.readLine());

		for(int i=0;i<4;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}

		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		int a=Integer.parseInt(br.readLine());
	}
}
