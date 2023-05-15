import java.io.*;
class StrAnagramDemo{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter First String =");
		String s1=br.readLine();
		
		System.out.println("Enter Second String =");
		String s2=br.readLine();
		
		StrAnagramDemo obj=new StrAnagramDemo();
		obj.checkAnagramStr(s1,s2);
	}
	
	void checkAnagramStr(String s1,String s2){
	    char arr1[]=(s1.toLowerCase()).toCharArray();
	    char arr2[]=(s2.toLowerCase()).toCharArray();
	    if(arr1.length!=arr2.length){
	        System.out.println("Not Anagram");
	    }
	    else{
	        int flag=0;
	        for(int i=0;i<arr1.length;i++){
	            int count=0,count1=0;
	            for(int j=0;j<arr1.length;j++){
	                if(arr1[i]==arr2[j]){
	                    count++;
	                }
	                if(arr1[i]==arr1[j]){
	                    count1++;
	                }
	            }
	            if(count==count1){
	                flag=1;
	            }
	            else{
			flag=0;
	                System.out.println("Not Anagram");
	                break;
	            }
	        }
	        if(flag==1){
	            System.out.println("Both String are Anagram");
	        }
	    }
	}
}
