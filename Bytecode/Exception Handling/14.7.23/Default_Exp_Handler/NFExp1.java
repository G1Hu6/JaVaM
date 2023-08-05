import java.io.*;
class Demo{
	void getData(){
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int data=Integer.parseInt(br.readLine());
		System.out.println(data);
	}
	public static void main(String[] args){
		Demo obj=new Demo();
		obj.getData();
	}
}
/*7.23/Default_Exp_Handler$ javac NFExp1.java
NFExp1.java:5: error: unreported exception IOException; must be caught or declared to be thrown
		int data=Integer.parseInt(br.readLine());
		                                     ^
1 error
 */
