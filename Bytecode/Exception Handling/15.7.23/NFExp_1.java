import java.io.*;
class Demo{
	public static void main(String[] args){
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
                String str=br.readLine();			//error: unreported exception IOException; must be caught or decleard to be thrown.
                System.out.println(str);

                int data=Integer.parseInt(br.readLine());	//error: unreported exception IOException; must be caught or decleard to be thrown.
                System.out.println(data);
        }
}

