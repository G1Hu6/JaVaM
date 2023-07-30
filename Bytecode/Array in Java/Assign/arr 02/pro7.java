import java.io.*;
class CommonElementsIn2Array{
	public static void main(String[] args) throws IOException{
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("Size1:");
	    int size1=Integer.parseInt(br.readLine());
	    int arr1[]=new int[size1];
	    System.out.println("arr1:");
	    for(int i=0;i<arr1.length;i++){
	        arr1[i]=Integer.parseInt(br.readLine());
	    }
	    
	    System.out.println("Size2:");
	    int size2=Integer.parseInt(br.readLine());
	    int arr2[]=new int[size2];
	    System.out.println("arr2:");
	    for(int i=0;i<arr2.length;i++){
	        arr2[i]=Integer.parseInt(br.readLine());
	    }
	    System.out.println("Common elements:")
	    for(int i=0;i<arr1.length;i++){
	        for(int j=0;j<arr2.length;j++){
	    if(arr1[i]==arr2[j]){
	        System.out.println(arr1[i]);
	    }
	    }
	    }
	}
}
