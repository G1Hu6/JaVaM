import java.util.Scanner;
class StudentMarks{
    public static void main(String sa []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 subject marks out of 100 ");
        int mark[]=new int[5];
        for(int i=0;i<5;i++){
            System.out.println("Enter "+(1+i)+" subject marks ");
            mark[i]=sc.nextInt();
            if(mark[i]>100 || mark[i]<0){
                System.out.println("Please enter valid marks ");
                System.exit(0);
            }
        }
        int Percentage=0;
        for(int i=0;i<5;i++){
            if(mark[i]<35){
                System.out.println("You are falied exam in "+(i+1)+" subject");
                System.exit(0);
            }
            Percentage=Percentage +mark[i];
        }
        Percentage=Percentage/5;
        float perc= (float)Percentage;
        System.out.println("Your Percentage is "+perc );
        switch(Percentage/10){
              case 10:
                   System.out.println("You got distinction");
                   break;
              case 9:
                   System.out.println("You got distinction");
                   break;
              case 8:
                   System.out.println("You got distinction");
                   break;
              case 7:
                   System.out.println("You got distinction");
                   break;
              case 6:
                   System.out.println("You got first class");
                   break;
              case 5:
                   System.out.println("You got second class ");
                   break;
              case 4:
                  System.out.println("You are pass in exam");
                  break;
        }
    }
}
