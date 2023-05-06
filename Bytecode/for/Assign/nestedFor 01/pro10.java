/*write a program to print the following pattern
1 2 3 4
2 3 4 5
3 4 5 6
4 5 6 7
 */

class Pro10{
	public static void main(String[] p){
		int n=4;
		for(int i=1;i<=n;i++){
			int num=i;
			for(int j=1;j<=n;j++){
				System.out.print(num++ +" ");
			}
			System.out.println();
		}
	}
}
