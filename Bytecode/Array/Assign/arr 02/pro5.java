
import java.io.*;
class Pro5{
     public static void main(String[]m)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int size=Integer.parseInt(br.readLine());
        int arr[]=new int[size];
        for(int i =0;i<arr.length;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("minimum="+min);
        }
}
