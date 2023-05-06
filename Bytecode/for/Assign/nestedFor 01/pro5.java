/*Q5
write a program to print the following pattern
12 12 12
11 11 11
10 10 10
 */
class Pro5{
	public static void main(String[] args){
		int n=3;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				System.out.print(13-i+" ");
			}
			System.out.println();
		}
	}
}
