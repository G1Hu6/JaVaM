/*Q7
write a program to print the following pattern
F
E F
D E F
C D E F
B C D E F
A B C D E F
 */
class Pro7{
	public static void main(String []args){
		int n=6;
		char ch='F';
		char ch1;
		for(int i=1;i<=n;i++){
			ch1=ch;
			for(int j=1;j<=i;j++){
				System.out.print(ch1 +" ");
				ch1++;
			}
			System.out.println("");
			ch--;
		}
	}
}
