/*
 Write a program to print the second max element in the array
Input: Enter array elements: 2 255 2 1554 15 65
Output: 255
 */

import java.io.*;
class Pro10{
        public static void main(String[]args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                int size=Integer.parseInt(br.readLine());
                int arr[]=new int[size];
		int min=Integer.MAX_VALUE;
		int smin=Integer.MAX_VALUE;

                for(int i=0;i<arr.length;i++){
                        arr[i]=Integer.parseInt(br.readLine());
                }
                for(int i=0;i<arr.length-1;i++){
                     if(arr[i]<min){
		  	  smin=min;
			  min=arr[i];
		     }
		     else if(arr[i]<smin && arr[i]!=min){
		     	  smin=arr[i];
		     }	  
                        
                } 
                System.out.println("second Min Element = "+smin);
        }
}





/*
import java.io.*;
class Pro10{
        public static void main(String[]args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                int size=Integer.parseInt(br.readLine());
                int arr[]=new int[size];
                for(int i=0;i<arr.length;i++){
                        arr[i]=Integer.parseInt(br.readLine());
                }
                for(int i=0;i<arr.length-1;i++){
                        for(int j=i+1;j<arr.length;j++){
                                if(arr[j]<arr[i]){
                                        int temp=arr[i];
                                        arr[i]=arr[j];
                                        arr[j]=temp;
                                }
                        }

                }
                System.out.println("second Min Element = "+arr[1]);
        }
}
*/           
