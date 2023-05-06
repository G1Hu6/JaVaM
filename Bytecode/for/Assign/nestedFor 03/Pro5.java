/*Q5
write a program to print the following pattern
10 10 10 10
11 11 11
12 12
13
 */
class Pro5{
	public static void main(String[]args){
		int n=4;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n-i+1;j++){
				System.out.print(9+i +" ");
			}
			System.out.println();
		}
	}
}
