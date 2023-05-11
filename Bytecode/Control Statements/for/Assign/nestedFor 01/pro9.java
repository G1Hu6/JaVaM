/*Q9
write a program to print the following pattern
C B A
C B A
C B A
 */
class Pro9{
	public static void main(String []o){
		int n=3;
		for(int i=1;i<=n;i++){
			char ch='C';
			for(int j=1;j<=n;j++){
				System.out.print(ch--+ " ");
			}
			System.out.println();
		}
	}
}
