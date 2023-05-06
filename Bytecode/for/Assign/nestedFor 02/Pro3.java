/*write a program to print the following pattern

14 15 16 17
15 16 17 18
16 17 18 19
17 18 19 20
 */
class Pro3{
	public static void main(String []args){
		int n=4;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				System.out.print(13+i-1+j+" ");
			}
			System.out.println("");
		}
	}
}
