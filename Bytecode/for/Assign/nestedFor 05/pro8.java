/*Q8
write a program to print the following pattern
Row =8

$
@ @
& & &
# # # #
$ $ $ $ $
@ @ @ @ @ @
& & & & & & &
# # # # # # # #
*/

import java.util.*;
class Pro8{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No. of Row =");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				if(i==n || i==n-4 ||i==n-8){
					System.out.print("# ");
				}
				else if(i==n-1 || i==n-5 || i==n-9){
                                        System.out.print("& ");
                                }
				else if(i==n-2 || i==n-6 || i==n-10){
                                        System.out.print("@ ");
                                }
				else if(i==n-3 || i==n-7 || i==n-11){
                                        System.out.print("$ ");
                                }
			}
			System.out.println();
		}

	}
}
