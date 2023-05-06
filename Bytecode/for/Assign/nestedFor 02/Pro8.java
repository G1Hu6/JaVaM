/*Q8
write a program to print the following pattern

A b C d
E f G h
I j K l
M n O p
 */
class Pro8{
	public static void main(String []w){
		int n=4;
		char ch='A';
		char vr='a';
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(j%2!=0){
					System.out.print(ch++ +" ");
					vr++;
				}
				else{
					System.out.print(vr++ +" ");
					ch++;
				}
			}
			System.out.println();
		}
	}
}
