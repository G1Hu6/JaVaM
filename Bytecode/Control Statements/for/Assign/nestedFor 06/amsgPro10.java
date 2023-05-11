/*
 
 Write a program to take range as input from the user and print Armstrong numbers. ( Take a start and
end number from a user )
Input: Enter start: 1
Enter end: 1650
Output: Armstrong numbers between 1 and 1650
1 2 3 4 5 6 7 8 9 153 370 371 407 1634
 */
import java.io.*;
class AmsgPro10{
	public static void main(String[] args)throws IOException{
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in ));
	    System.out.println("Start =");
	    int start=Integer.parseInt(br.readLine());
	    System.out.println("end =");
	    int end=Integer.parseInt(br.readLine());
	    for(int i=start;i<=end;i++){
		int s=0;
	    	for(int j=0;j<1;j++){
			s=am(i);
		}
		if(s==i){
			System.out.println(i);
		}
	    }
            
	}
	static int am(int a){
		int num=a;
		int v=a;
		int count=0;
		while(num!=0){
			count++;
			num=num/10;
		}
		int sum=0;
		while(v!=0){
			int mul=1;
			for(int k=0;k<count;k++){
				mul=mul*(v%10);
			}
			sum=sum+mul;
			v=v/10;
		}
		return sum;
	}
}

