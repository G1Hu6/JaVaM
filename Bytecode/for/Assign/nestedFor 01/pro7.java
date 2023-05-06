/*Q7
write a program to print the following pattern
D D D D
D D D D
D D D D
D D D D
*/
class Pro7{
	public static void main(String[]e){
		int n=4;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				System.out.print("D ");
			}
			System.out.print("\n");
		}
	}
}
