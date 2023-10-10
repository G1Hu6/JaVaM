import java.util.*;

class LeetCode07{
	static int findReverse(int x){
		int rev = 0;
	
       		while(x != 0){
			int a = x % 10;

			if((rev < Integer.MIN_VALUE/10) || (rev > Integer.MAX_VALUE/10)){
				return 0;
			}
			rev = rev*10 + a;
			x = x / 10;
		}
		return rev;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number =");
		int num = sc.nextInt();

		System.out.println("Reversed Number = " + findReverse(num));
	}
}
