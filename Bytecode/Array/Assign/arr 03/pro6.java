import java.io.*;
class Pro6{
	public static void main(String[]g)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		Pro6 obj=new Pro6();
		for(int i=0;i<arr.length;i++){
			/*
			int num=arr[i];
                	int rev=0;
                	while(num!=0){
                        	rev=rev*10+(num%10);
                        	num=num/10;
                	}
                	if(rev==arr[i])
				System.out.println("Palindrome number "+arr[i]+" is at index "+i);
			*/
			obj.pali(arr[i],i);

		}
	}

	void pali(int a,int i){
		int num=a;
		int rev=0;
		while(num!=0){
			rev=rev*10+(num%10);
			num=num/10;
		}
		if(rev==a)
			System.out.println("Palindrome number "+a+" is at index "+i);
		
	}
}
