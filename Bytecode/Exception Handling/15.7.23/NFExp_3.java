import java.io.*;
class Demo{
        public static void main(String[] args)throws IOException,NumberFormatException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter String =");
                String str=br.readLine();
                System.out.println(str);

		int data=0;

		try{
			System.out.println("data =");
                	data=Integer.parseInt(br.readLine());
		}
		catch(NumberFormatException obj){
			System.out.println("Please Enter Integer Input");
			data=Integer.parseInt(br.readLine());
		}
                System.out.println(data);
        }
}
/*
 * superv@superv-VMware-Virtual-Platform:~/JavaClass/Bytecode/Exception Handling/15.7.23$ java Demo
Enter String =
Pranav
Pranav
data =
King
Please Enter Integer Input
23
23

 */

