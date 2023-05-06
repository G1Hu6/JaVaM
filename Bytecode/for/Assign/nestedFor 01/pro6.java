/*Q6
write a program to print the following pattern
9 8 7
9 8 7
9 8 7
 */
class Pro6{
	public static void main(String[] a){
		int n=3;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				System.out.print(10-j+" ");
			}
			System.out.println();
		}
	}
}
