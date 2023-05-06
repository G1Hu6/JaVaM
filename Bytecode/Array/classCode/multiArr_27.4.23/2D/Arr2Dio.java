import java.io.*;
class Arr2Dio{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		int arr[][]=new int[3][2];
		/*
		arr[0][0]=10;
		arr[0][1]=20;
		arr[1][0]=30;
		arr[1][1]=99;
		arr[2][0]=11;
		arr[2][1]=30;
		*/

		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				arr[i][j]=Integer.parseInt(br.readLine());
			}
		}
		for(int i=0;i<3;i++){
			for(int j=0;j<2;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}
}
