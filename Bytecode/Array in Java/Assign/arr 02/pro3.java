/*Program 3
Write a Java program to find the sum of even and odd numbers in an array.
Display the sum value.
Input: 11 12 13 14 15
Output
Odd numbers sum = 39
Even numbers sum = 26
 */

import java.io.*;
class SumOfEvenOddElements{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Array Size =");
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];

		System.out.println("Enter Array Elements =");
		int evenSum=0;
		int oddSum=0;
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
			if(arr[i]%2!=0){
				oddSum=oddSum+arr[i];
			}
			else{
				evenSum=evenSum+arr[i];
			}
		}
		System.out.println("Even Numbers Sum="+ evenSum);
		System.out.println("Odd Numbers Sum="+ oddSum);
	}
}
