/*write a program to print the following pattern

4 4 4 4
5 5 5 5
6 6 6 6
7 7 7 7
 */
class Pro2{
	public static void main(String []args){
		 int n=4;
		 for(int i=1;i<=n;i++){
		 	for(int j=1;j<=n;j++){
				System.out.print(n+i-1+ " ");
			}
			System.out.print("\n");
		 }
	}
}
