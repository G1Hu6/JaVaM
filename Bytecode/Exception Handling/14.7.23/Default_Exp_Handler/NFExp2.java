import java.io.*;
class Demo{
	void getData()throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int data=Integer.parseInt(br.readLine());
		System.out.println(data);
	}
	public static void main(String[] args){
		Demo obj=new Demo();
		obj.getData();
	}
}
		                    
/*.7.23/Default_Exp_Handler$ javac NFExp2.java
NFExp2.java:10: error: unreported exception IOException; must be caught or declared to be thrown
		obj.getData();
		           ^
1 error

 */
