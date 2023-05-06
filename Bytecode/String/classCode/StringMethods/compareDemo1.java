import java.io.*;
class CompDemo1{
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str1=br.readLine();
		String str2=br.readLine();
		CompDemo1 obj=new CompDemo1();
		System.out.println(obj.myComp2(str1,str2));
		//System.out.println(str1.compareTo(str2));
	}
	int myComp2(String s1,String s2){
		char arr1[]=s1.toCharArray();
		char arr2[]=s2.toCharArray();

		if(arr1.length==arr2.length){

		for(int i=0;i<arr1.length;i++){
			if(arr1[i]!=arr2[i]){
				int aski=(int)(arr1[i]-arr2[i]);
				return aski;
			}
		}
		}
		else{
			int m;
			if(arr2.length<arr1.length){
				m=arr2.length;
			}
			else{
				m=arr1.length;
			}
			for(int i=0;i<m;i++){
                        if(arr1[i]!=arr2[i]){
                                int aski=(int)(arr1[i]-arr2[i]);
                                return aski;
                        }
               	     }
		     return -(arr2.length-arr1.length);
		}
		return 0;
	}
}
