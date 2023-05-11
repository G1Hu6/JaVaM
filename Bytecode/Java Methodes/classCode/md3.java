import java.io.*;
class Cal{
	void add(int a,int b){
		int ans1=a+b;
		System.out.println(ans1);
	}
	void sub(int a,int b){
                int ans2=a-b;
                System.out.println(ans2);
        }
	void mul(int a,int b){
                int ans3=a*b;
                System.out.println(ans3);
        }
	void div(int a,int b){
                int ans4=a/b;
                System.out.println(ans4);
        }

	public static void main(String[]k)throws IOException{
		Cal n=new Cal();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter int values :");
		int a=Integer.parseInt(br.readLine());
		int b=Integer.parseInt(br.readLine());
		n.add(a,b);
		n.mul(a,b);
		n.sub(a,b);
		n.div(a,b);
	}
}
