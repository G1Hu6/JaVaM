/*
 Q1
write a program to print the following pattern
C2W C2W C2W
C2W C2W C2W
C2W C2W C2W
 */
class Pro1{
	public static void main(String[]args){
		int n=3;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				System.out.print("C2W ");
			}
			System.out.println();
		}
	}
}
