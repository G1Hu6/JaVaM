/*Q4
write a program to print the following pattern
1 2 3 4
2 3 4
3 4
4
 */
class Pro4{
	public static void main(String[] args){
		int n=4;
		for(int i=1;i<=n;i++){
			int num=i;
			for(int j=1;j<=n-i+1;j++){
				System.out.print(num++ +" ");
			}
			System.out.println();
		}
	}
}
