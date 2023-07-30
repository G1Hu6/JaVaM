/*Program 5
Write a program ,take 10 input from the user and print only elements that are divisible by
5.
Input: 10 2 2 3 3 3 4 4 25 55
Output: 10 25 55
 */

import java.io.*;
class DivBy5{
	public static void main(String[] p)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Size =");
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];

		System.out.println("Enter Array Elements =");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}

		System.out.println("Elements Divisible by 5 are =");
		for(int i=0;i<arr.length;i++){
			if(arr[i]%5==0){
				System.out.println(arr[i]);
			}
		}
	}
}
