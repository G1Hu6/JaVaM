import java.util.*;
class Demop{
	public static void main(String[]o){
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[3];

	//	arr[0]=Integer.parseInt(sc.nextLine());//Exception in thread "main" java.lang.NumberFormatException: For input string: "A"
		arr[0]=sc.nextInt();
		arr[1]=sc.nextInt();
		arr[2]=sc.nextInt();

		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		int a=sc.nextInt();

	}
}
