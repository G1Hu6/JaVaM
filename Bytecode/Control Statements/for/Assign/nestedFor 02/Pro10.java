/*Q10
write a program to print the following pattern

F 5 D 3 B 1
F 5 D 3 B 1
F 5 D 3 B 1
F 5 D 3 B 1
F 5 D 3 B 1
F 5 D 3 B 1
 */
class Pro10{
	public static void main(String []w){
		int n=6;
	
		for(int i=1;i<=n;i++){
			char ch='F';
			char vr='6';
			for(int j=1;j<=n;j++){
				if(j%2!=0){
					System.out.print(ch-- +" ");
					vr--;
				}
				else{
					System.out.print(vr-- +" ");
					ch--;
				}
			}
			System.out.println();
		}
	}
}
