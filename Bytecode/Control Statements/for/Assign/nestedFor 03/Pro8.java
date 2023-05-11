/*Q8
write a program to print the following pattern
J
I H
G F E
D C B A
 */
class Pro8{
    public static void main(String args[]) {
        int n=4;
        char ch='J';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch-- +" ");
            }
            System.out.println();
        }
    }
    
}
