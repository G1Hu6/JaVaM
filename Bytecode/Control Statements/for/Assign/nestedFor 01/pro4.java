/*
 * Q4.
 write a program to print the following pattern

1A 1A 1A
1A 1A 1A
1A 1A 1A
 */
class Pro4{
	public static void main(String[]args){
		int n=3;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				System.out.print("1A ");
			}
			System.out.println();
		}
	}
}
