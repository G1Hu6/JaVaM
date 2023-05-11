/*Q8
write a program to print the following pattern
10
I H
7 6 5
D C B A
 */
class Pro8{
	public static void main(String[]args){
		int n=4;
		char ch='J';
		int num=10;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				if(i%2!=0){
					System.out.print(num-- +" ");
					ch--;
				}
				else{
					System.out.print(ch-- +" ");
					num--;
				}
			}
			System.out.println();
		}
	}
}
