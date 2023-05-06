/*
 Q3
write a program to print the following pattern
14 14 14 14
15 15 15 15
16 16 16 16
17 17 17 17
 */
class Pro3{
	public static void main(String []p){
		int n=4;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				System.out.print(i+13+" ");
			}
			System.out.println();
		}
	}
}
