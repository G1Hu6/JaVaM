/*Q6
write a program to print the following pattern

1  4  9
16 25 36
49 64 81
 */
class Pro6{
	public static void main(String [] l){
		int n=3;
		int a=1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				System.out.print(a*a +" ");
				a++;
			}
			System.out.println();
		}
	}
}
