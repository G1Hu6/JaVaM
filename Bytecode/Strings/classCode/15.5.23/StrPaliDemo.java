import java.io.*;
class StrPaliDemo{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String =");
		String s=br.readLine();

		checkPaliStr(s);
	}
	
	static void checkPaliStr(String s){
	    int flag=0;
	    char arr[]=s.toCharArray();
	    int e=arr.length-1;
	    for(int i=0;i<arr.length;i++){
	        if(arr[i]==arr[e]){
	             flag=1;
	        }
	        else{
	            flag=0;
	            System.out.println("Given String is Not Palindrome");
	            break;
	        }
	        e--;
	    }
	    if(flag==1){
	        System.out.println("Given String Palindrome");
	    }
	}
}
