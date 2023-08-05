import java.io.*;
class Pro3{
	public static void main(String[]p)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		//Pro2 obj=new Pro2();
		for(int i=0;i<arr.length;i++){
			int count=0;
			for(int j=1;j<=arr[i];j++){
				if(arr[i]%j==0){
					count++;
				}
				if(count>2){
					break;
				}
			}
			if(count==2){
				//System.out.println("Composite no "+arr[i]+" at index "+ i);
			}
			else{
				 System.out.println("Composite no "+arr[i]+" at index "+ i);
			}
		}
	        }
}
