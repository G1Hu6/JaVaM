/*Q10
write a program to print the following pattern
1
8 9
9 64 25
64 25 216 49
 */
class Pro10{
	public static void main(String []args){
		int n=4;
		
		for(int i=1;i<=n;i++){
			int a=i;
			for(int j=1;j<=i;j++){
			if((i+j)%2!=0){
				System.out.print(a*a*a +" ");
				a++;
			}
			else{
				System.out.print(a*a +" ");
                                a++;
			}
			}
			System.out.println();
		}

	}
}
