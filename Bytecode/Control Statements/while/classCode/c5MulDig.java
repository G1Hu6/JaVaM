import java.util.*;
class Some{
        public static void main(String args[]){
        Scanner p=new Scanner(System.in);
        int n=p.nextInt();
        int mul=1;
                while(n!=0){
                        int a=n%10;
                        mul*=a;//sum=sum+a;
                        n=n/10;
                }
                System.out.println("Multiplication of Digits= "+mul);
        }
}

