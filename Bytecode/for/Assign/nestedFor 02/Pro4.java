/*Q4
write a program to print the following pattern

1A 2B 3C
1A 2B 3C
1A 2B 3C
 */
class Pro4{
	public static void main(String[] p){
		int n=3;
		for(int i=1;i<=n;i++){
			char ch='A';
			for(int j=1;j<=n;j++){
				System.out.print(j +""+ ch++ +" ");
			}
			System.out.println("");
		}
	}
}
