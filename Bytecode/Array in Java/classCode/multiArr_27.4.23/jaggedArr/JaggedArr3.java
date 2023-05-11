import java.io.*;
class Pro3{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//int arr[][]=new int[3][];
		/*
		 *internally---> int arr[][]={new int[]{1,2,3},new int[]{1,2},new int[]{1}}
		 *
		arr[0]={1,2,3};	//when we declear an array then and then only we have to give inilizer list.	
		arr[1]={4,5};   //it gives lot of errors because here objects of 1D arry is not created.
		arr[0]={6};
		*/
		/*
		arr[0]=new int[]{1,2,3};
		arr[1]=new int[]{1,2};
		arr[2]=new int[]{1};
		
		for(int x[]:arr){
			for(int y:x){
				System.out.print(y+" ");
			}
			System.out.println();
		}
		arr[0]=int new[3];
		arr[0]=int new[2];
		arr[0]=int new[1];
		*/

		System.out.println("Enter no. of row ="); 
		int row=Integer.parseInt(br.readLine());

		int arr[][]=new int[row][]; 
		for(int i=0;i<row;i++){
			System.out.println("Enter no. of column in "+i +" array =" );
			int col=Integer.parseInt(br.readLine());
			arr[i]=new int[col];
			for(int j=0;j<col;j++){
				arr[i][j]=Integer.parseInt(br.readLine());
			}
		}
		for(int x[]:arr){
                        for(int y:x){
                                System.out.print(y+" ");
                        }
                        System.out.println();
		}
	}

}
