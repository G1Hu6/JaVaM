import java.io.*;

class FactorDemo{
        static int findSquareRoot(int num){
                int s = 1;
		int e = num;
		int ans = 0;
		int itr = 0;

		while(s <= e){
			itr++;
			int m = (s + e)/2;

			if(m*m == num){
				System.out.println(itr);
				return m;
			}else if(m*m < num){
				ans = m;
				s = m + 1;
			}else if(m*m > num){
				e = m - 1;
			}
		}
		System.out.println(itr);
		return ans;
        }

        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter value :");

                int num = Integer.parseInt(br.readLine());

                System.out.println("Square Root = " + findSquareRoot(num));
        }
}

