/*Q5
write a program to print the following pattern
A B C D
B C D
C D
D
 */
class Pro5{
	public static void main(String[] a){
		int n=4;
		for(int i=1;i<=n;i++){
			char ch=(char)('A'+i-1);
			for(int j=1;j<=n-i+1;j++){
				System.out.print(ch++ +" ");
			}
			System.out.println();
		}
	}
}
