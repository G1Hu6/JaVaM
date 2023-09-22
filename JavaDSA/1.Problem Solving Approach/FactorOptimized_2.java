/*
import java.io.*;

//Math.sqrt() is a method so its stack frame is pushed so its time complexity 'log N base 2' is also increased so we have to use different way

class FactorDemo{
        static int factorCount(long num){
                int count = 0;
                for(int i = 1; i <= Math.sqrt(num); i++){
                        if(num % i == 0){
                                if(i == num/i){
					count += 1;
				}else{
					count += 2;
				}
                        }
                }
                return count;
        }

        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter value for finding count of factors :");
                long num = Integer.parseInt(br.readLine());

                System.out.println("Count of Factors = " + factorCount(num));
        }
}
*/
import java.io.*;

class FactorDemo{
        static int factorCount(int num){
                int count = 0;
                for(int i = 1; i*i <= num; i++){
                        if(num % i == 0){
                                if(i == num/i){
                                        count += 1;
                                }else{
                                        count += 2;
                                }
                        }
                }
                return count;
        }

        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter value for finding count of factors :");
                int num = Integer.parseInt(br.readLine());

                System.out.println("Count of Factors = " + factorCount(num));
        }
}

