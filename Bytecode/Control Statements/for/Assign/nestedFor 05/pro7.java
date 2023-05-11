/*Q7
write a program to print the following pattern
Row =5;
O
14 13
L K J
9 8 7 6
E D C B A

Row = 4
10
I H
7 6 5
D C B A

USE THIS FOR LOOP STRICTLY for the outer loop
Int row;
Take row from user
for(int i =1;i<=row;i++){
}

 */



import java.io.*;
class Pro7{
	public static void main(String []p)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the no. of rows =");
		int n=Integer.parseInt(br.readLine());
		char ch='A';
		int num=1;
		for(int i=1;i<n;i++){
			num=num+(i+1);
		}
		ch=(char)(64+num);

		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				if(n%2!=0){
					if(i%2!=0){
						System.out.print(ch-- +"  ");
						num--;
					}
					else{
						System.out.print(num-- +" ");
						ch--;	
					}
				}
				else{
                                        if(i%2!=0){
                                                System.out.print(num-- +" ");
                                                ch--;
                                        }
                                        else{
                                                System.out.print(ch-- +"  ");
                                                num--;
                                        }
                                }
			}
			System.out.println();	
		}
	}
}	

