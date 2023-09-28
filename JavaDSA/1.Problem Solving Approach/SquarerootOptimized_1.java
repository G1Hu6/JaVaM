/*
import java.io.*;

class FactorDemo{
	static int findSquareRoot(int num){
		int val = 0;
		int itr = 0;

		for(int i = 1; i <= num; i++){
			itr++;

			if(i*i <= num){
				val = i;
			}else{
				break;
			}
		}
		System.out.println(itr);
		return val;
	}

	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter value :");

		int num = Integer.parseInt(br.readLine());

		System.out.println("Square Root = " + findSquareRoot(num));
	}
}
*/

import java.io.*;

class FactorDemo{
        static int findSquareRoot(int num){
                int val = 0;
                int itr = 0;

                for(int i = 1; i*i <= num; i++){
                        itr++;

                        if(i*i <= num){
                                val = i;
                        }else{
                                break;
                        }
                }
                System.out.println(itr);
                return val;
        }

        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter value :");

                int num = Integer.parseInt(br.readLine());

                System.out.println("Square Root = " + findSquareRoot(num));
        }
}

