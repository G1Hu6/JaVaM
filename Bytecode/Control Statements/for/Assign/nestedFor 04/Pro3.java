/*Q3
write a program to print the following pattern
10
10 9
9 8 7
7 6 5 4
 */
class Pro3{
	public static void main(String[] args){
		int n=4;
		int num=10;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print(num-- +" ");
			}
			num++;
			System.out.println();
		}
	}
}
