import java.io.*;
class Pro2{
	public static void main(String []u)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter row no =");
		int row=Integer.parseInt(br.readLine());
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				if(i==j){
					System.out.print("# ");
				}
				else{
					System.out.print("= ");
				}
			}
			System.out.println();
		}
	}
}
