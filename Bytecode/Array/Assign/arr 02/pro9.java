/*Program 9
Write a Java program to merge two given arrays.
Array1 = [10, 20, 30, 40, 50]
Array2 = [9, 18, 27, 36, 45]
Output :
Merged Array = [10, 20, 30, 40, 50, 9, 18, 27, 36, 45]
Hint: you can take 3rd array
 */
import java.io.*;
class Pro9{
	public static void main(String[] args) throws IOException{
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    
	    System.out.println("Size1 =");
	    int size1=Integer.parseInt(br.readLine());
	    int arr1[]=new int[size1];
	    System.out.println("Enter Elements in Array1 =");
	    for(int i=0;i<arr1.length;i++){
	        arr1[i]=Integer.parseInt(br.readLine());
	    }
	    
	    
	    System.out.println("Size2 =");
	    int size2=Integer.parseInt(br.readLine());
	    int arr2[]=new int[size2];
	    System.out.println("Enter Elements in Array2 =");
	    for(int i=0;i<arr2.length;i++){
	        arr2[i]=Integer.parseInt(br.readLine());
	    }
	    
    	    int mer[]=new int[arr1.length+arr2.length];
	    for(int i=0;i<mer.length;i++){
	    	if(i<arr1.length){
			mer[i]=arr1[i];
		}
		else{
			mer[i]=arr2[i-arr1.length];
		}
	    }	    

	    System.out.println("Merged Array =");
	    for(int i=0;i<mer.length;i++){
	    	System.out.print(mer[i] +" ");
	    }
		
	}
}
