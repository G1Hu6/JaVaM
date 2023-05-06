import java.io.*;
class Try{
    public static void main(String[]m)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("size1=");
        int size1=Integer.parseInt(br.readLine());
	System.out.println("size2=");
        int size2=Integer.parseInt(br.readLine());
        int arr[]=new int[size1];
	int arr1[]=new int[size2];
	System.out.println("array1=");
	int i=0,j=0;
        for(i =0;i<arr.length;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
	System.out.println("array2=");
        for(j =0;j<arr1.length;j++){
            arr[j]=Integer.parseInt(br.readLine());
        }
	i=0;
	j=0;
        for(int k=0;k<arr.length;k++){
            	if(arr[i]==arr1[j]){
                	System.out.println(arr[i]);
             	}
	i++;
	j++;
        }
    }
}
