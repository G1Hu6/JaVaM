/*Q9
write a program to print the following pattern
1C3 4B2 9A1
16C3 25B2 36A1
49C3 64B2 81A1
 */
class Pro9{
	public static void main(String[] p){
		int n=3;
		int a=1;
		for(int i=1;i<=n;i++){
			char ch='C';
			int num=3;
			for(int j=1;j<=n;j++){
				System.out.print(a*a +""+ ch-- +""+ num-- +" ");
				a++;
			}
			System.out.println("");
		}
	}
}
