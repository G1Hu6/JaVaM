/*write a program to print the following pattern
1 2 3 4
4 5 6
6 7
7
*/
class Pro10{
	public static void main(String[] args){
		int num=1;
		int n=4;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n-i+1;j++){
				System.out.print(num++ +" ");	
			}
			num--;
			System.out.println();
		}
	}
}
