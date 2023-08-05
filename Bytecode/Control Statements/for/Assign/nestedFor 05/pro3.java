import java.io.*;
class Pro3{
	public static void main(String[]p)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Row =");
		int row=Integer.parseInt(br.readLine());
		int num=row;
		for(int i=1;i<=row;i++){
			num=(row-i+1)*i;
			for(int j=1;j<=row-i+1;j++){
				System.out.print(num +" ");
				num=num-i;	
			}
			System.out.println();
		}
	}
}
