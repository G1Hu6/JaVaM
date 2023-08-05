/*Q7
write a program to print the following pattern
1 2 9
4 25 6
49 8 81
 */
class Pro7{
	public static void main(String []r){
		int n=3;
		int a=1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if((i+j)%2==0){
					System.out.print(a*a +" ");
					a++;
				}
				else{
					System.out.print(a+" ");
					a++;
				}
			}
			System.out.println();
		}
	}
}
