/*Program 4
WAP to search a specific element from an array and return its index.
Input: 1 2 4 5 6
Enter element to search: 4
Output: element found at index: 2
 */
import java.io.*;
class Pro4{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Array Size =");
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];

		System.out.println("Enter Array Elements =");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}

		System.out.println("Enter Element to search :");
		int key=Integer.parseInt(br.readLine());
		int flag=0;
		for(int i=0;i<arr.length;i++){
                        if(arr[i]==key){
				System.out.println("Element found at index :"+i);
			}
			else{
			       flag=1;
			}
                }
		if(flag==1){
			System.out.println("Element Not found");
		}
	}
}
