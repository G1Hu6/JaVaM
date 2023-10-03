import java.util.*;
class ArrayB40{
	static boolean isPerfectSquare(int s){
		int n = (int)Math.sqrt(s);
		return n*n == s;
	}
	static boolean isFibonacci(int f){
		if(isPerfectSquare(5*f*f + 4) || isPerfectSquare(5*f*f - 4))
			return true;
		else 
			return false;
	}
	static int countOfFib(int arr[], int n){
		int count = 0;
		for (int i = 0; i < n; i++){
			if(isFibonacci(arr[i]))
				count++;
		}
		return count;
	}
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter size of Array :");
                int size = sc.nextInt();

                int arr[] = new int[size];
                System.out.println("Enter elements in array :");
                for(int i = 0; i<arr.length; i++){
                        arr[i] = sc.nextInt();
                }

		System.out.println("Count of Fibonacci = " + countOfFib(arr, size));
	}

}
