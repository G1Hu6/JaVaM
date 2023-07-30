/*Program 10
WAP to print the elements whose addition of digits is even.
Ex. 26 = 2 + 6 = 8 (8 is even so print 26)
Input :
Enter array : 1 2 3 5 15 16 14 28 17 29 123
Output: 2 15 28 17 123
 */
import java.io.*;
class DigitsHavingEvenSum{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Array Size =");
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];

		System.out.println("Enter Array Elements =");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		
		Pro10 obj=new Pro10();
		System.out.println("elements whose addition of digits is even =");
		for(int i=0;i<arr.length;i++){
			obj.evenSum(arr[i]);
		}
	}
	void evenSum(int arr){
		int sum=0;
		int n=arr;
		while(n!=0){
			sum=sum+(n%10);
			n=n/10;
		}
		if(sum%2==0){
			System.out.println(arr);
		}
	}
}
