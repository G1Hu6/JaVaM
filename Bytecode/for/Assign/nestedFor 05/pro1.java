import java.io.*;
class Pro1{
	public static void main(String []p)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the no. of rows =");
		int row=Integer.parseInt(br.readLine());
		char ch=(char)(64+row);
		int num=row;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				if(i%2!=0){
					System.out.print(ch-- +""+ num-- +" ");
				}
				else{
					System.out.print(ch++ +""+ num++ +" ");
				}
			}
			if(i%2!=0){
				ch++;
				num++;
			}
			else{
				ch--;
				num--;
			}
			System.out.println("");
		}
	}
}
