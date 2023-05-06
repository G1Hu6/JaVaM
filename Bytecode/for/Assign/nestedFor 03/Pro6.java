/*Q6
write a program to print the following pattern

9
9 8
9 8 7
9 8 7 6
 */
class Pro6{
	public static void main(String[] p){
		int n=4;
		for(int i=1;i<=n;i++){
			int num=9;
			for(int j=1;j<=i;j++){
				System.out.print(num-- +" ");
			}
			System.out.print("\n");
		}
	}
}
