/*
Q4
Take choice from user
Show this to user
What's your interest?
1.movies
2.Series
Enter your choice 1 or 2 :
If user enters 1 :
Movie you wish to watch today
1.Founder
2. Snowden
3.Jobs
4.Her
5.Social Network
6.Wall-E
7.AI

Enter your choice :
2 : Snowden

If user enters 2 :
Best series to watch
1.Silicon valley
2.Devs
3.the IT crowd
4.Mr Robot
Print users choice
*/
import java.io.*;
class Interest{
	public static void main(String [] args)throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("What's your interest? \n1.movies\n2.Series\nEnter your choice 1 or 2 : ");
		int choice1=Integer.parseInt(br.readLine());
		switch(choice1){
			case 1:
				System.out.println("Movie you wish to watch today\n1.Founder\n2. Snowden\n3.Jobs\n4.Her\n5.Social Network\n6.Wall-E\n7.AI");
				System.out.println("enter your choice : ");
				int choice2=Integer.parseInt(br.readLine());
				switch(choice2){
					case 2:
					        System.out.println("Best series to watch\n1.Silicon valley\n2.Devs\n3.the IT crowd\n4.Mr Robot ");
			         		System.out.print("Enter your choice : ");
				        	int choice3=Integer.parseInt(br.readLine());
				        	switch(choice3){
							case 1:
								System.out.println("You selected: Silicon valley ");
								break;
							case 2:
								System.out.println("You selected: Devs");
								break;
							case 3:
								System.out.println("You selected: the IT crowd");
								break;
							case 4:
								System.out.println("You selected: Mr Robot");
								break;
							default:
								System.out.println("Please enter valid choice");
								break;
						}
						break;
					default:
						System.out.println("Please enter valid choice ");
                                                 break;
				}
				break;
			default:
				System.out.println("Please enter valid choice ");
                                 break;
		}
		}
}


