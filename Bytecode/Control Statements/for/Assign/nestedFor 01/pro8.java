/*Q8
write a program to print the following pattern

d d d d
c c c c
b b b b
a a a a
 */
class Pro8{
	public static void main(String[] l){
		int n=4;
		char ch='d';
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				System.out.print(ch+" ");
			}
			ch--;
			System.out.println();
		}
	}
}
