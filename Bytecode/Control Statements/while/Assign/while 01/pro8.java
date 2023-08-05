/*Program 8: Write a program to print the countdown of days to submit the
assignment
Input : day = 7
Output: 7 days remaining
6 days remaining

5 days remaining
.
.
1 days remaining
0 days Assignment is Overdue
 */
class Pro8{
	public static void main(String[] args){
		int day = 5;
			if(day == 0){
				System.out.println(day + " days Assignment is Overdue");
			}
			else{
				while(day>=1){
						System.out.println(day + " days remaning");
						day--;
					}
					if(day == 0){
					System.out.println(day + " days remaining is Overdue");
					}
				}
	}
}
