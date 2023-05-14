/*Program 6: Write a program to print the sum of all even numbers and
multiplication of odd numbers between 1 to 10.
Output: sum of even numbers between 1 to 10 = 30
Multiplication of odd numbers between 1 to 10 = 945
 */
class Pro6{
	public static void main(String[] args){
		int a=0;
		int mul=1,sum=0;
		while(a!=11){
			if(a%2==0){
				sum=sum+a;
			}
			else{
				mul=mul*a;
			}
			a++;
		}
		System.out.println("sum of even numbers between 1 to 10 =" +sum);
		System.out.println("Multiplication of odd numbers between 1 to 10 =" +mul);
	}
}
