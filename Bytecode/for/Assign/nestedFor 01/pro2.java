/*
 Q2
write a program to print the following pattern

4 5 6 7
4 5 6 7
4 5 6 7
4 5 6 7

USE THIS FOR LOOP STRICTLY
for(int i =1;i<=4;i++){
for(j=1;j<=4;j++){
}
}
 */
class Pro2{
	public static void main(String[] args){
		int n=4;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				System.out.print(j+3 +" ");
			}
			System.out.println();
		}
	}
}
