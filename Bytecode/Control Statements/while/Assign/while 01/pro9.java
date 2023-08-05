/*Program 9: Write a program to reverse the given number.
Input: 942111423
Output: 324111249
 */
class Pro9{
	public static void main(String[] args){
		int n=942111423;
		int rev=0;
		while(n!=0){
			rev= rev*10 +(n%10);
			n=n/10;
		}
		System.out.println("Reverse number ="+rev);
	}
}
