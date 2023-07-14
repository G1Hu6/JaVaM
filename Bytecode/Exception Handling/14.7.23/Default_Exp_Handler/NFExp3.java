import java.io.*;
class Demo{
	void getData()throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int data=Integer.parseInt(br.readLine());
		System.out.println(data);
	}
	public static void main(String[] args)throws IOException{
		Demo obj=new Demo();
		obj.getData();
	}
}
/*superv@superv-VMware-Virtual-Platform:~/JavaClass/Bytecode/Exception Handling/14.7.23/Default_Exp_Handler$ java Demo
shashi
Exception in thread "main" java.lang.NumberFormatException: For input string: "shashi"
	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
	at java.base/java.lang.Integer.parseInt(Integer.java:652)
	at java.base/java.lang.Integer.parseInt(Integer.java:770)
	at Demo.getData(NFExp3.java:5)

 */
