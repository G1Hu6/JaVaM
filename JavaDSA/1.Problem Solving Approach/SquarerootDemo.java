import java.io.*;

class FactorDemo{
	static int findSquareRoot(int num){
		int val = 0;
		for(int i = 1; i <= num; i++){
			if(i*i <= num){
				val = i;
			}
		}
		return val;
	}

	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter value :");

		int num = Integer.parseInt(br.readLine());

		System.out.println("Square Root = " + findSquareRoot(num));
	}
}
