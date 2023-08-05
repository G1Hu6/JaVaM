/*Program 10: Write a program to check whether the number is a Palindrome
number or not. (2332)
Output: 2332 is a palindrome number
 */
class Pro10{
	public static void main(String[] args){
		int n=2332;
		int num=n;
		int rev=0;
		while(n!=0){
			rev= rev*10 +(n%10);
			n=n/10;
		}
		if(num==rev)
			System.out.println(rev +" is a Palindrome number");
	}
}
