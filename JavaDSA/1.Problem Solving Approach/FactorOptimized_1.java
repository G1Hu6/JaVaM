import java.io.*;

class FactorDemo{
        static int factorCount(int num){
                int count = 0;
                for(int i = 1; i <= num/2; i++){
                        if(num % i == 0){
                                count++;
                        }
                }
                return count + 1;
        }

        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter value for finding count of factors :");
                int num = Integer.parseInt(br.readLine());

                System.out.println("Count of Factors = " + factorCount(num));
        }
}

