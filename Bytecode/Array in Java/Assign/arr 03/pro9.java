/*
 Write a program to print the second max element in the array
Input: Enter array elements: 2 255 2 1554 15 65
Output: 255
 */

//Optimized code:
import java.io.*;
class Pro9{
        public static void main(String[]args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                int size=Integer.parseInt(br.readLine());
                int arr[]=new int[size];
		int max=Integer.MIN_VALUE;
		int smax=Integer.MIN_VALUE;

                for(int i=0;i<arr.length;i++){
                        arr[i]=Integer.parseInt(br.readLine());
                }
                for(int i=0;i<arr.length-1;i++){
                     if(arr[i]>max){
		  	  smax=max;
			  max=arr[i];
		     }
		     else if(arr[i]>smax && arr[i]!=max){
		     	  smax=arr[i];
		     }	  
                        
                } 
                System.out.println("second Max Element = "+smax);
        }
}

/*
import java.io.*;
class Pro9{
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
		/*
		for(int x:arr){
			System.out.println(x);
		}
		
		System.out.println("second Max Element = "+arr[arr.length-2]);
	}
}
*/
