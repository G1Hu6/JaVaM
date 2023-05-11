import java.io.*;
class Pro1{
	public static void main(String []args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the size of array=");
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];
		
		int oddSum=0;
		System.out.println("Enter the elements of array=");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
			if(arr[i]%2!=0){
				oddSum=oddSum+arr[i];
			}
		}
		System.out.println("Sum of Odd numbers="+oddSum);		
	}
}
